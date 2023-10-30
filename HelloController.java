package com.example.javacalculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    Calculator calc = new Calculator();
    @FXML
    private TextField InputField;
    @FXML
    protected void onOneButtonClick(){
        String val = InputField.getText();
            if (val.equals("0")) val = "";
            InputField.setText( val + "1");
        }

    @FXML
    protected void onTwoButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "2");
    }

    @FXML
    protected void onThreeButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "3");
    }

    @FXML
    protected void onFourButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "4");
    }

    @FXML
    protected void onFiveButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "5");
    }

    @FXML
    protected void onSixButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "6");
    }

    @FXML
    protected void onSevenButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "7");
    }

    @FXML
    protected void onEightButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "8");
    }

    @FXML
    protected void onNineButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "9");
    }

    @FXML
    protected void onZeroButtonClick(){
        String val = InputField.getText();
        if (val.equals("0")) val = "";
        InputField.setText( val + "0");
    }

    @FXML
    protected void onPlusButtonClick(){
        calc.setOperator('+');
        String val = InputField.getText();
        double d = Double.parseDouble(val);

        calc.setOperand1(d);
        InputField.setText(" ");

    }

    @FXML
    protected void onMinusButtonClick(){
        calc.setOperator('-');
        String val = InputField.getText();
        double d = Double.parseDouble(val);

        calc.setOperand1(d);
        InputField.setText(" ");

    }

    @FXML
    protected void onMultipleButtonClick(){
        calc.setOperator('*');
        String val = InputField.getText();
        double d = Double.parseDouble(val);

        calc.setOperand1(d);
        InputField.setText(" ");

    }

    @FXML
    protected void onDivisionButtonClick(){
        calc.setOperator('/');
        String val = InputField.getText();
        double d = Double.parseDouble(val);

        calc.setOperand1(d);
        InputField.setText(" ");

    }

    @FXML
    protected void onEqualButtonClick(){
        String val = InputField.getText();
            double d = Double.parseDouble(val);
            calc.setOperand2 (d);
            calc.calculate();
            d = calc.getResult();
            InputField.setText(" " + d);

        }

    @FXML
    protected void onClearButtonClick(){
        InputField.setText(" ");
    }

}