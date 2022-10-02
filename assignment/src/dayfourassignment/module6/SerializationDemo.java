package dayfourassignment.module6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Vector;

public class SerializationDemo {
	    /**
	     * Persists a list of {@link Person} to a file.
	     * @param list
	     * @param filename
	     * @throws FileNotFoundException
	     * @throws IOException
	     */
	    public static void store(List<Serialisason> list, String filename) throws FileNotFoundException, IOException
	     {
	     try(ObjectOutputStream outstream = new ObjectOutputStream(new FileOutputStream(filename));)
	     {
	     outstream.writeObject(list);
	     }
	     }
	    /**
	     * Loads a list of {@link Person} from a file
	     * @param filename
	     * @return
	     * @throws FileNotFoundException
	     * @throws IOException
	     * @throws ClassNotFoundException
	     */
	    @SuppressWarnings("unchecked")
	    public static List<Serialisason> load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	     {
	     try(ObjectInputStream instream =new ObjectInputStream(new FileInputStream(filename));)
	     {
	     return (List<Serialisason>)instream.readObject();
	     }
	     }
	    @SuppressWarnings("removal")
		public static void main(String[] args)
	     {
	     if (args.length != 1)
	     {
	     System.out.println("Usage: java module6.SerializationDemo filename");
	     System.exit(-1);
	     }
	     
	     // Getting the list ready
	     Serialisason p1 = new Serialisason("Karl Pearson",79, "United Kingdom"),
	     p2 = new Serialisason("John Tukey",85, "United States");
	     
	     Vector<Serialisason> inList = new Vector<Serialisason>();
	     inList.add(p1);
	     inList.add(p2);
	     try
	     {
	     // Store the list to a file
	     SerializationDemo.store(inList, args[0]);
	     
	     // Load the list from a file
	     List<Serialisason> outList = SerializationDemo.load(args[0]);
	     for (Serialisason p : outList)
	     System.out.println(p.toString());
	     }
	     catch (IOException | ClassNotFoundException e)
	     {
	     e.printStackTrace();
	     }
	     }
	    }
	
