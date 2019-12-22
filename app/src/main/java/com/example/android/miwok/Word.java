package com.example.android.miwok;

public class Word {
    private String mDefaulTranslation;
    private  String mMiwokTranslation;
    private  int getmAudioResourceId;
    public int getmAudioResourceId() {
        return getmAudioResourceId;
    }


    private  final  int NO_IMAGE_=-1;
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    private int mImageResourceId=NO_IMAGE_;
    public Word(String mDefaulTranslation,String mMiwokTranslation,int mAudioResourceId)
    {
        this.mDefaulTranslation=mDefaulTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.getmAudioResourceId=mAudioResourceId;

    }
    public Word(String mDefaulTranslation,String mMiwokTranslation,int mImageResourceId,int mAudioResourceId)
    {
        this.mDefaulTranslation=mDefaulTranslation;
        this.mMiwokTranslation=mMiwokTranslation;
        this.mImageResourceId=mImageResourceId;
        this.getmAudioResourceId=mAudioResourceId;
    }
    public  String getmDefaulTranslation()
    {
        return  mDefaulTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean hasIMAGE_() {
        return mImageResourceId != NO_IMAGE_;
    }
}
