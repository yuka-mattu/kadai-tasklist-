package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;


public class TaskValidators {

 // バリデーションを実行する
    public static List<String> validate(Task m) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String check_col_error = _validateCheck_col(m.getCheck_col());
        if(!check_col_error.equals("")) {
            errors.add(check_col_error);
        }

        return errors;
    }

    // 内容の必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }

    // 進捗の必須入力チェック
    private static String _validateCheck_col(String check_col) {
        if(check_col == null || check_col.equals("")) {
            return "進捗状況を入力してください。";
        }

        return "";
    }

}
