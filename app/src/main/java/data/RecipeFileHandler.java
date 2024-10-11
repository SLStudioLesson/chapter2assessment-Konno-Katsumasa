package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import ui.RecipeUI;

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
        // 返すためのリストを用意する
        ArrayList<String> recipesList = new ArrayList<>();
        //ファイルを読み込む
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Tomato Soup,Tomatoes, Onion, Garlic, Vegetable Stock
            while ((line = reader.readLine()) != null) {
                // 読み込んだ内容をリストに追加する
                recipesList.add(line);

                // System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
        // リスト形式で返す
        return recipesList;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName  レシピ名
     * @param ingredients 材料名
     */
    //
    public void addRecipe(String recipeName, String ingredients) {
        //ユーザーが新しいレシピと材料を入力（登録する）
        ArrayList<String> lists2 = new ArrayList<>();
        // lists2 = fileHandler.displayRecipes();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            //addNewRecipesで入力された値を受け取る

            //そぬ値をぃすとに追加する
            

        } catch (IOException e) {

        }
    }
}
