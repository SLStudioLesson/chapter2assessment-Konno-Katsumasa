package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RecipeFileHandler {
    private String filePath;

    public RecipeFileHandler() {
        filePath = "app/src/main/resources/recipes.txt";
    }

    public RecipeFileHandler(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 設問1: 一覧表示機能
     * recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br> 
     * IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
     *
     * @return レシピデータ
     */
    public ArrayList<String> readRecipes() {
        try {
            
            File filePath = new File("app/src/main/resources/recipes.txt");
            if (filePath.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line = reader.readLine();
                if (line != null) {
                    String[] data = line.split(",");
                    
                }else if (line == null) {
                    System.out.println("データなし");
                    
                }
                
                
                // reader.close();
                // for(String filepath :filePath){
                    
                // }
            } 
            // return ArrayList<>();

        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
        return null;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName レシピ名
     * @param ingredients 材料名
     */
     // 
    public void addRecipe(String recipeName, String ingredients) {
        // try {

        // } catch (IOException e) {

        // }
    }
}
