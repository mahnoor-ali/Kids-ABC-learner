package com.mano.learnabc;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class ViewAdapter extends ArrayAdapter<Alphabet> {

    public ViewAdapter(@NonNull Context context, @NonNull ArrayList<Alphabet> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Alphabet alphabet = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent, false);
        }
        TextView description = convertView.findViewById(R.id.description);
        description.setText(alphabet.getAlphabet());
        ImageView img = convertView.findViewById(R.id.imgA);
        img.setImageResource(alphabet.getImgResource());
        return convertView;
    }
}
