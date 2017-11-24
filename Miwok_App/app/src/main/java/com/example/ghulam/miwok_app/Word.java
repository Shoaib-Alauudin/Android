package com.example.ghulam.miwok_app;

/**
 * Created by Ghulam on 9/6/2017.
 */

public class Word {
    private String mMiwokTranslation; // Miwok translation for the word
    private String mDefaultTranslation; // Default translation for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED; // Image resource ID for the word
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
