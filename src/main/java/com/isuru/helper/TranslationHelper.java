package com.isuru.helper;

import com.isuru.util.LanguageEnum;

public class TranslationHelper {

    public static String translate(LanguageEnum translateTo) {

        switch (translateTo) {
            case ENGLISH:
                return LanguageEnum.ENGLISH.getLanguage();
            case DANISH:
                return LanguageEnum.DANISH.getLanguage();
            case DUTCH:
                return LanguageEnum.DUTCH.getLanguage();
            case FINNISH:
                return LanguageEnum.FINNISH.getLanguage();
            case FRENCH:
                return LanguageEnum.FRENCH.getLanguage();
            case GERMAN:
                return LanguageEnum.GERMAN.getLanguage();
            case GREEK:
                return LanguageEnum.GREEK.getLanguage();
            case HEBREW:
                return LanguageEnum.HEBREW.getLanguage();
            case HUNGARIAN:
                return LanguageEnum.HUNGARIAN.getLanguage();
            case ITALIAN:
                return LanguageEnum.ITALIAN.getLanguage();
            case JAPANESE:
                return LanguageEnum.JAPANESE.getLanguage();
            case PORTUGUESE:
                return LanguageEnum.PORTUGUESE.getLanguage();
            case RUSSIAN:
                return LanguageEnum.RUSSIAN.getLanguage();
            case SWEDISH:
                return LanguageEnum.SWEDISH.getLanguage();
            case TURKISH:
                return LanguageEnum.TURKISH.getLanguage();
            case URDU:
                return LanguageEnum.URDU.getLanguage();
            default:
                return LanguageEnum.ENGLISH.getLanguage();
        }
    }
}
