package com.example.bank.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bank.R;
import com.example.bank.model.User;
import com.squareup.picasso.Picasso;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    User[]users;

    public UserAdapter(User[] users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_single_on_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.logInTV.setText(users[position].getLogin());

        Picasso.get().load(users[position].getAvatarUrl()).into(holder.userImage);
    }

    @Override
    public int getItemCount() {
        return users.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView logInTV;
        private ImageView userImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logInTV = itemView.findViewById(R.id.logInTV);
            userImage = itemView.findViewById(R.id.userImage);
        }
    }
}
