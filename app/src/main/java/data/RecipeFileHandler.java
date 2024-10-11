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
        // ファイルを読み込む
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
    // 「「「「「RecipeUIでaddNewRecipe()でユーザーが入力した文字列をaddRecipeに渡さないといけない」」」」
    // RecipeUIでaddRecipeを引数を入れて呼ぶ
    // →その時これが初めて動く
    // recipeName,ingredientsを定義する
    String recipeName = "";   //最初は何も入れない
    String ingredients = "";   //最初は何も入れない
    public void addRecipe(String recipeName, String ingredients) {
        // RecipeUI recipeUI = new RecipeUI();
        // ユーザーが新しいレシピと材料を入力（登録する）
        // 「「「引数recipeName,ingredientが受け取った文字列をファイルに書き込む」」」
        // ファイルに書き込む準備をする
        // 追記するから二つ目の引数にtrue
        // どこのファイルに書くか指定（filePath）
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            // 書き込む内容をカンマ区切りで(,)つなげて(join)1行にする,,,いらないかも
            //つなげた二つを持つStringが必要
            String mixData = recipeName + ","+ ingredients;
            // 書き込む内容はrecipeName,ingredients
            // ファイルに書き込む
            //引数にはStringの変数を入れる
            writer.write(mixData);
            // 書き込むごとに改行 
            writer.newLine();
        } catch (IOException e) {

        }
    }
}
