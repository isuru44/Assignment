package com.isuru.model;

import com.isuru.helper.TranslationHelper;
import com.isuru.util.LanguageEnum;
import com.isuru.util.SoundEnum;

public class Rooster extends Chicken{

    private LanguageEnum language = LanguageEnum.ENGLISH;

    public Rooster(){}

    public Rooster(LanguageEnum language){
        this.language = language;
    }
    @Override
    public String sing() {
        String output = TranslationHelper.translate(language);
        System.out.println(output);
        return output;
    }
}
