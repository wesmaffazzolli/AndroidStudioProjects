package br.com.androidpro.customlist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCell extends ArrayAdapter {

    private final Activity context;
    private final String[] refri;
    private final Integer[] imageId;

    public ListCell(Activity context, String[] refri, Integer[] imageId) {
        super(context, R.layout.activity_list_cell, refri);
        this.context = context;
        this.refri = refri;
        this.imageId = imageId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list_cell, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(refri[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
