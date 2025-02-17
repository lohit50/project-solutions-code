class Solution {
    public static void Generate(String tiles, Set<String> list, StringBuilder temp, boolean[] used){
        if(temp.length() > 0){
            list.add(temp.toString());
            System.out.println(temp.toString());
        }
        for(int i = 0; i < tiles.length(); i++){
            if(used[i] == true) continue;
            temp.append(tiles.charAt(i%tiles.length()));
            used[i] = true;
            Generate(tiles, list, temp, used);
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
    }

    public int numTilePossibilities(String tiles) {
        Set<String> list = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        StringBuilder temp = new StringBuilder();
        int start = 0;
        Generate(tiles, list, temp, used);
        return list.size();
    }
}