package com.example.tvproject;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    Context c;
    List<Model> list;
    int size;

    public Adapter(Context c, List<Model> list, int size) {
        this.c = c;
        this.list = list;
        this.size = size;
    }

    @NonNull
    @Override
    public Adapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new MyAdapter(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyAdapter holder, int position) {
        Model model=list.get(position);
        holder.profileImage.setImageResource(model.getProfileImage());
        holder.charName.setText(model.getUserName());
        holder.charDesc.setText(model.getUserDesc());
        holder.showMorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dialogView = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
                de.hdodenhof.circleimageview.CircleImageView dialog_box_profile_image;
                TextView dialog_box_char_name;
                TextView dialog_box_char_desc;
                dialog_box_profile_image=dialogView.findViewById(R.id.dialog_box_char_image);
                dialog_box_char_name=dialogView.findViewById(R.id.dialog_box_char_name);
                dialog_box_char_desc=dialogView.findViewById(R.id.dialog_box_char_desc);
                dialog_box_profile_image.setImageResource(model.getProfileImage());
                dialog_box_char_name.setText(model.getUserName());
                dialog_box_char_desc.setText(model.getUserDesc());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView profileImage;
        TextView charName;
        TextView charDesc;
        Button showMorebtn;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            profileImage=itemView.findViewById(R.id.imageView);
            charName=itemView.findViewById(R.id.user_name);
            charDesc=itemView.findViewById(R.id.user_desc);
            showMorebtn=itemView.findViewById(R.id.btn);
        }
    }
}
