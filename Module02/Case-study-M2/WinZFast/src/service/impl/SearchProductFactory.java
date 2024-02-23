package service.impl;

import constant.Constants;
import service.ISearch;

import java.io.Serializable;

public class SearchProductFactory implements Serializable {
    public static ISearch createISearch(int flag){
        switch (flag){
            case Constants.SEARCH_NAME: {
                return new SearchName();
            }
            case Constants.SEARCH_BRAND: {
                return new SearchBrand();
            }
            case Constants.SEARCH_YEAR: {
                return new SearchYear();
            }
            default:{
                return null;
            }
        }
    }
}
