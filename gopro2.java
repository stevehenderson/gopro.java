// gopro.java, a button that triggers the gopro
import java.net

        {
            Desktop.getDesktop().browse(new URL("http://10.5.5.9/bacpac/SH?t=PASSWORD&p=%01").toURI());
        }           // Replace PASSWORD by the camera wifi password
        catch (Exception e) {}
      
        {
            Desktop.getDesktop().browse(new URL("http://10.5.5.9/bacpac/SH?t=PASSWORD&p=%00").toURI());
        }           // Replace PASSWORD by the camera wifi password
        catch (Exception e) {}
      
