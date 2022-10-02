package dayfourassignment;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFile implements FilenameFilter{
	private String ext;

	public SearchFile(String ext) {
		this.ext = ext;
	}
	@Override
	public boolean accept(File loc, String name) {
		if(name.lastIndexOf('.')>0)
        {
           // get last index for '.' 
           int lastIndex = name.lastIndexOf('.');
       
           String str = name.substring(lastIndex);
            
           if(str.equalsIgnoreCase(ext))
           {
              return true;
           }
        }
        return false;
		
	}

}
