package com.example.ghulam.miwok_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.ghulam.miwok_app.R.id.default_text_view;
import static com.example.ghulam.miwok_app.R.id.miwok_text_view;

/**
 * Created by Ghulam on 9/6/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /* Resource ID for the background color for this list of words */
    private int mColorResourceId = 0;

//    ColorResourceId is used for constructor pass color to the constructor.
    public WordAdapter(Context context, ArrayList<Word> word, int colorResourceId) {
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//      Check if the existing view is being resused, otherwise inflate
//      the view
        View listItemView = convertView;

//      It run first time whe the we open up an activity
        if (convertView == null){
            listItemView =
                     LayoutInflater.from(getContext()).
                            inflate(R.layout.list_item, parent, false);
        }

 //      Get the object located at this position in the list
        Word currentWord = getItem(position);


        // Find the imageView in the List_item.xml layout with the ID image.
        ImageView miwokImageView =
                (ImageView)listItemView.findViewById(R.id.miwok_image);

        if (currentWord.hasImage()){
            //Set the ImageView to the image resource specified in the current Word
            miwokImageView.setImageResource(currentWord.getImageResourceId());

            // Make sure Image view is visible
            miwokImageView.setVisibility(listItemView.VISIBLE);
        }
        else
            // Otherwise hide the View of ImageView.
            miwokImageView.setVisibility(listItemView.GONE);


        TextView defaultTextView =
                (TextView)listItemView.findViewById(default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView =
                (TextView)listItemView.findViewById(miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        // set the theme color for the list items
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
