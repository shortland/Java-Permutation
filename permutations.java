import java.util.ArrayList;

public class permutations {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList();

		// permutations of 2468
		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(8);

		ArrayList<ArrayList<Integer>> perms = listPermutations(intList);
		for(ArrayList<Integer> p : perms) {
			for(Integer i : p) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static ArrayList<ArrayList<Integer>> listPermutations(ArrayList<Integer> list) {
		if(list.size() == 0) {
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

			result.add(new ArrayList<Integer>());
			return result;
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		Integer firstElement = list.remove(0);
		ArrayList<ArrayList<Integer>> otherPerms = listPermutations(list);

		for(ArrayList<Integer> permutation : otherPerms) {
			for(int i = 0; i <= permutation.size(); i++) {
				ArrayList<Integer> temp = new ArrayList<Integer>(permutation);
				temp.add(i, firstElement);
				result.add(temp);
			}
		}
		return result;
	}



}