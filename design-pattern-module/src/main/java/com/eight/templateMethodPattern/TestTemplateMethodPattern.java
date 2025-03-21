package com.eight.templateMethodPattern;

import com.eight.templateMethodPattern.adjustedDesign.Coffee;
import com.eight.templateMethodPattern.adjustedDesign.Tea;
import org.junit.Test;

public class TestTemplateMethodPattern {

    @Test
    public void test(){
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee("n");
        coffee.prepareRecipe();
    }
}
