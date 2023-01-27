package log;

import java.util.logging.Level;
import java.util.logging.Logger;

class stw
{
    Logger logger = Logger.getLogger(stw.class.getSimpleName());

    public static void main() 
    {
        logger.log(Level.INFO,"We are building Lantro UI. Help us in our projects by purchasing them.");
    }
}
