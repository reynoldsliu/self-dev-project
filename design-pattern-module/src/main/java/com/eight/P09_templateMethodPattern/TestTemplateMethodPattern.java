package com.eight.P09_templateMethodPattern;

import com.eight.P09_templateMethodPattern.adjustedDesign.Coffee;
import com.eight.P09_templateMethodPattern.adjustedDesign.Tea;
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
