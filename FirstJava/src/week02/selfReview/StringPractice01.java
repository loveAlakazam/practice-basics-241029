package week02.selfReview;

public class StringPractice01 {
    public static void main(String[] args) {
        // sampleStr 변수는 우항의 문자열("What do you say? Say peace! Hakuna Matata")의 주소값을 저장하는 참조형변수이다.
        // 참조형변수는 크기의 제한이 없다.
        String sampleStr = "What do you say? Say peace! Hakuna Matata";

        // 문자열주소값 출력
        int sampleStrAddress = System.identityHashCode(sampleStr);
        System.out.println("sampleStr의 주소값: " + sampleStrAddress);

        // length 길이 출력
        System.out.println("\n--- String.length() ---");
        System.out.println("sampleStr.length() : " + sampleStr.length()); // 41

        // substring 출력
        System.out.println("\n--- String.substring() ---");
        System.out.println("sampleStr.subString(17, 27) : " + sampleStr.substring(17, 27)); // Say peace!
        System.out.println("sampleStr.subString(0, 15) : " + sampleStr.substring(0, 15)); // What do you say
        // substring 은 새로운문자열을 생성하여 일부문자열을 추출하기때문에, 원본문자열의 값은 그대로 유지한다.
        System.out.println("sampleStr :" + sampleStr);

        // equals
        System.out.println("\n--- String.equals() ---");
        System.out.println("sampleStr.equals(\"common\") : " + sampleStr.equals("common")); // false
        System.out.println("sampleStr.substring(0, 15).equals(\"What do you say\") : " +
                sampleStr.substring(0, 15).equals("What do you say")); // true

        // contains
        System.out.println("\n--- String.contains() ---");
        System.out.println("sampleStr.contains(\"peace\"): "+ sampleStr.contains("peace")); // true

        // charAt
        System.out.println("\n--- String.charAt() ---");
        System.out.println("sampleStr.charAt(21) : "+ sampleStr.charAt(21)); // p


        // Upper case
        System.out.println("\n--- String.toUpperCase() ---");
        System.out.println("sampleStr.toUpperCase(): "+ sampleStr.toUpperCase()); // WHAT DO YOU SAY? SAY PEACE! HAKUNA MATATA

        // toCharArray()
        System.out.println("\n--- String.toCharArray() ---");
        char[] charArr = sampleStr.toCharArray();
        System.out.println("sampleStr.toCharArray() 의 결과인 charArr 배열주소값 : "+ charArr);
        for(char item: charArr) {
            System.out.printf("[%c] ", item);
        }


        // 새로운 String객체로 만들기
        System.out.println("\n--- String 얕은 복사 (주소값대입) ---");
        String shallowCopyStr = sampleStr; // 참조하는 대상의 주소값은 같음. 얕은복사
        int shallowCopyStrAddress = System.identityHashCode(shallowCopyStr);
        System.out.println("shallowCopyStr: "+ shallowCopyStr);

        // shallowCopyStr 이 가리키는대상이 sampleStr 가리키는 대상이 같음. 주소값이 같음.
        System.out.println("원본과 복사본의 참조형변수의 주소값이 같은가? : "+ (shallowCopyStrAddress == sampleStrAddress)); // true
        System.out.println("shallowCopyStr == sampleStr : " + (shallowCopyStr == sampleStr)); // true
        System.out.println("sampleStr.equals(shallowCopyStr): " + sampleStr.equals(shallowCopyStr)); // true

        System.out.println("\n--- String 깊은 복사 (새로운 String 생성) ---");
        String deepCopyStr = new String(sampleStr);
        int deepCopyStrAddress = System.identityHashCode(deepCopyStr);
        System.out.println("deepCopyStr: " + deepCopyStr );
        System.out.println("원본과 복사본의 참조형변수의 주소값이 같은가? : "+ (deepCopyStrAddress == sampleStrAddress)); // false
        System.out.println("deepCopyStr == sampleStr : " + (deepCopyStr == sampleStr)); // false
        System.out.println("sampleStr.equals(deepCopyStr) : " + sampleStr.equals(deepCopyStr)); // true

    }
}

/**
 * [[ 출력 결과 ]]
 *
 * sampleStr의 주소값: 925858445
 *
 * --- String.length() ---
 * sampleStr.length() : 41
 *
 * --- String.substring() ---
 * sampleStr.subString(17, 27) : Say peace!
 * sampleStr.subString(0, 15) : What do you say
 * sampleStr :What do you say? Say peace! Hakuna Matata
 *
 * --- String.equals() ---
 * sampleStr.equals("common") : false
 * sampleStr.substring(0, 15).equals("What do you say") : true
 *
 * --- String.contains() ---
 * sampleStr.contains("peace"): true
 *
 * --- String.charAt() ---
 * sampleStr.charAt(21) : p
 *
 * --- String.toUpperCase() ---
 * sampleStr.toUpperCase(): WHAT DO YOU SAY? SAY PEACE! HAKUNA MATATA
 *
 * --- String.toCharArray() ---
 * sampleStr.toCharArray() 의 결과인 charArr 배열주소값 : [C@54bedef2
 * [W] [h] [a] [t] [ ] [d] [o] [ ] [y] [o] [u] [ ] [s] [a] [y] [?] [ ] [S] [a] [y] [ ] [p] [e] [a] [c] [e] [!] [ ] [H] [a] [k] [u] [n] [a] [ ] [M] [a] [t] [a] [t] [a]
 */
