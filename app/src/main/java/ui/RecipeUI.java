package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

import data.RecipeFileHandler;

public class RecipeUI {
    private BufferedReader reader;
    private RecipeFileHandler fileHandler;

    public RecipeUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        fileHandler = new RecipeFileHandler();
    }

    public RecipeUI(BufferedReader reader, RecipeFileHandler fileHandler) {
        this.reader = reader;
        this.fileHandler = fileHandler;
    }

    public void displayMenu() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        // 設問1: 一覧表示機能
                        // RecipeFileHandler rfh = new RecipeFileHandler();

                        // data.RecipeFileHandler drfh = new data.RecipeFileHandler();
                        // drfh.readRecipes();

                        // ArrayList<String> fileHandler = new ArrayList<>();
                        displayRecipes();

                        break;
                    case "2":
                        // 設問2: 新規登録機能
                        addNewRecipe();
                        fileHandler.addRecipe(input1,input2);


                        break;
                    case "3":
                        // 設問3: 検索機能
                        break;
                    case "4":
                        System.out.println("Exit the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    /**
     * 設問1: 一覧表示機能
     * RecipeFileHandlerから読み込んだレシピデータを整形してコンソールに表示します。
     */
    private void displayRecipes() {
        // レシピデータの保存先（箱）を作る
        ArrayList<String> list = new ArrayList<String>();
        // recipesListを受け取る
        list = fileHandler.readRecipes();
        // Tomato Soup,Tomatoes, Onion, Garlic, Vegetable Stock
        // リストから1つずつ取り出す
        System.out.println("Recipes:");
        System.out.println("-----------------------------------");
        for (String item : list) {

            String[] strs = item.split(",", 2);

            System.out.println("Recipe Name: " + strs[0]);
            System.out.println("Main Ingredients: " + strs[1]);
            System.out.println("-----------------------------------");
        }

        // ","で分割する

    }

    /**
     * 設問2: 新規登録機能
     * ユーザーからレシピ名と主な材料を入力させ、RecipeFileHandlerを使用してrecipes.txtに新しいレシピを追加します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    String input1 = "";
    String input2 = "";
    private void addNewRecipe() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter recipe name: ");
             input1 = reader.readLine();
            System.out.print("Enter main ingredients (comma separated): ");
             input2 = reader.readLine();
             System.out.println("Recipe added successfully.");
            //新しいレシピ（名前　input1）と（材料　input2）←recipeName,ingredient
    }

    /**
     * 設問3: 検索機能
     * ユーザーから検索クエリを入力させ、そのクエリに基づいてレシピを検索し、一致するレシピをコンソールに表示します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void searchRecipe() throws IOException {

    }

}
