
public class raguso_lab13 {

	private java.util.ArrayList<Integer> values = new java.util.ArrayList<>();
	
	public void readData(String filename) {
		String inn = "";
		try {
		      java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
		      while ((inn = input.readLine()) != null) {
		    	  values.add(Integer.parseInt(inn));
		      }
		      input.close();
		}
		catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public long getTotalCount() {
		return values.stream().count();
	}
	
	public long getOddCount() {
		return values.stream().filter(x -> x % 2 != 0).count();
	}
	
	public long getEvenCount() {
		return values.stream().filter(x -> x % 2 == 0).count();
	}
	
	public long getDistinctGreaterThanFiveCount() {
		return values.stream().distinct().filter(x -> x > 5).count();
	}
	
	public Integer[] getResult1() {
		return values.stream().filter(x -> (x % 2 == 0) && x > 5 && x < 50).sorted().toArray(Integer[]::new);
	}
	
	public Integer[] getResult2() {
		return values.stream().limit(50).map(x -> x * x * 3).toArray(Integer[]::new);
	}
	
	public Integer[] getResult3() {
		return values.stream().filter(x -> x % 2 != 0).map(x -> x * 2).sorted().skip(20).distinct().toArray(Integer[]::new);
	}
	
}
