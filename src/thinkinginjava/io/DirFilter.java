package thinkinginjava.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 11:04
 */
public class DirFilter implements FilenameFilter {

    String afn;

    public DirFilter(String afn) {
        this.afn = afn;
    }

    @Override
    public boolean accept(File dir, String name) {
        String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
}
