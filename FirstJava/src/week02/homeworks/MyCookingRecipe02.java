package week02.homeworks;

import java.util.*;

public class MyCookingRecipe02 {
    private static Set<String> allowedDataCollections;
    private static Scanner sc;

    public static void init() {
        allowedDataCollections = new HashSet<String>( Arrays.asList("set", "map", "list"));
        sc = new Scanner(System.in);
    }

    public static void main( String[] args ) {
        try {
            init();

            // 1. 저장할 자료구조명 입력
            System.out.print("자료구조명 입력(List/Set/Map): ");
            String inputDataCollection = sc.nextLine();

            // 2. 내가 좋아하는 요리제목 입력
            System.out.print("요리제목 입력: ");
            String title = sc.nextLine();

            // 3. 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력
            // "끝"을 입력할 때까지 문장을 넣기
            String inputStr;
            ArrayList<String> recipeProcess = new ArrayList<String>();
            while(true) {
                inputStr = sc.nextLine();
                if(inputStr.equals( "끝" ))
                    break;
                recipeProcess.add(inputStr);
            };

            // 콜렉션 초기화
            String dataCollection = inputDataCollection.toLowerCase();
            switch(dataCollection) {
                case "set":
                    Set< String > inputSet = new HashSet< String >( recipeProcess );
                    break;
                case "map":
                    Map<Integer, String> inputMap = new HashMap<>();
                    for(int i =0 ; i <  recipeProcess.size(); i++) {
                        String nowStr = recipeProcess.get(i);
                        inputMap.put(i, nowStr);
                    }
                    break;
                case "list":
                    break;
                default:
                    throw new Error("자료구조명은 List / Set / Map 중 하나를 입력해주세요.");
            }

            // 결과 출력
            title = "[ " + inputDataCollection + " " +  title + " ]";
            System.out.println(title);
            for(int i = 0 ; i < recipeProcess.size();  i++) {
                System.out.println((i+1) + ". " + recipeProcess.get(i));
            }

        } catch(Exception error) {
            throw error;
        }

    }
}
