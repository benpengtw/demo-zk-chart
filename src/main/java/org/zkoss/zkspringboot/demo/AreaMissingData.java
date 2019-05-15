package org.zkoss.zkspringboot.demo;

import org.zkoss.chart.model.CategoryModel;
import org.zkoss.chart.model.DefaultCategoryModel;


public class AreaMissingData {
    private final static CategoryModel model;

    static {
        model = new DefaultCategoryModel();
        model.setValue("John", "Apples", new Integer(0));
        model.setValue("John", "Pears", new Integer(1));
        model.setValue("John", "Oranges", new Integer(4));
        model.setValue("John", "Bananas", new Integer(4));
        model.setValue("John", "Grapes", new Integer(5));
        model.setValue("John", "Plums", new Integer(2));
        model.setValue("John", "Strawberries", new Integer(3));
        model.setValue("John", "Raspberries", new Integer(7));

        model.setValue("Jane", "Apples", new Integer(1));
        model.setValue("Jane", "Pears", new Integer(0));
        model.setValue("Jane", "Oranges", new Integer(3));
        model.setValue("Jane", "Bananas", null);
        model.setValue("Jane", "Grapes", new Integer(3));
        model.setValue("Jane", "Plums", new Integer(1));
        model.setValue("Jane", "Strawberries", new Integer(2));
        model.setValue("Jane", "Raspberries", new Integer(1));
    }

    public static CategoryModel getCategoryModel() {
        return model;
    }
}