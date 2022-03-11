package Config;

import Chip.AES;
import Chip.ICipher;

public enum Configuration {
    instance;

    public final String nameOfJavaArchive = "MixingUnit.jar";
    public final String nameOfClass = "MixingUnit";

    public final String fileSeparator = System.getProperty("file.separator");
    public final String userDirectory = System.getProperty("user.dir");

    public final String nameOfSubFolder = "jar";
    public final String subFolderPathOfJarArchive = nameOfSubFolder+fileSeparator+nameOfJavaArchive;
    public final String fullPathToJar = userDirectory+subFolderPathOfJarArchive;

    public final ICipher cipher = new AES();
}
