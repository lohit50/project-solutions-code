class Solution {

    public static boolean Merger(List<List<String>> accounts, int acc1, int acc2){
        // checking for unique email address : //
        Set<String> emailSet = new HashSet<>(accounts.get(acc2));
        boolean flag = false;
        for (int i = 1; i < accounts.get(acc1).size(); i++) {
            if (emailSet.contains(accounts.get(acc1).get(i))) {
                flag = true;
                break;
            }
        }
        // if same person : //
        if(flag == true){
            Set<String> mergedSet = new LinkedHashSet<>(accounts.get(acc2));
            mergedSet.addAll(accounts.get(acc1));
            accounts.set(acc2, new ArrayList<>(mergedSet));
            accounts.remove(acc1);
        }
        return flag;
    }


    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> ans = new ArrayList<>();
        int Hashable = 0;
        boolean merged = true;

        // Merging Duplicates until fully finished : //
        while(merged){
            merged = false;
            for(int i = 0; i < accounts.size(); i++){
                for(int j = i+1; j < accounts.size(); j++){
                    if(accounts.get(i).get(0).equals(accounts.get(j).get(0))){
                        if(Merger(accounts, i, j)){
                            merged = true;
                            break;
                        }
                    }
                }

            }
        }

        // Order(accounts);
        for(List<String> acc: accounts) {
            Collections.sort(acc.subList(1,acc.size()));
        }

        // removing deafault duplicates : 
        int index = 0;
        for(List<String> acc : accounts){
            Set<String> set = new LinkedHashSet<>(acc); 
            accounts.set(index,new ArrayList<>(set));
            index++;
        }

        return accounts;
    }
}