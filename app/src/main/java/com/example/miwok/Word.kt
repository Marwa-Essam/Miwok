package com.example.miwok

public class Word(s: String, s1: String) {

    private var mDefaultTranslation: String? = null


    private var miwokTranslation: String? = null


    fun Word(defaultTranslation: String?, miwokTranslation: String?) {
        mDefaultTranslation = defaultTranslation
        this.miwokTranslation = miwokTranslation
    }

    fun getDefaultTranslation(): String? {
        return mDefaultTranslation;
    }

    fun getMiwokTranslation(): String? {
        return miwokTranslation;
    }

}