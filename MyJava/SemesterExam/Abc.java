public class Abc {
    public static void main(String[] args) {
        String[][][] arr = { {{}, null},
            {{ "i", "2" }, { "1", null, "3" }},
            {},
            {{"1",null}}
        };

        System.out.println(arr[0].length);
        System.out.println(arr.length);
        System.out.println(arr[1][2].length);
    }
}
