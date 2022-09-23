package daythree.string;

public class Stringbuff {
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer();
		/* insert()
		 * delete()
		 * replace()
		 * reverse()
		 */
		System.out.println(st +"----"+st.capacity());
		st.append("lunch ");
		System.out.println();
		System.out.println(st+"------"+st.capacity());
		st.append("is ready for u ");
		System.out.println();
		System.out.println(st+"-----"+st.capacity());
		st.append(",pls come fast.....!");
		System.out.println();
		System.out.println(st+"------"+st.capacity());
		
	}

}
