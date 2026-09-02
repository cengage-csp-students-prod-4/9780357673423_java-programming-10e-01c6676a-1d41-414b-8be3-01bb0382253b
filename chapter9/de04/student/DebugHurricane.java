public class DebugHurricaine extends DebugStorm
{
   final int SEVERE = 95;
   public DebugHurricaine(String name, int speed)
   {
      setWindSpeed(speed);
   }
   @Override
   public void setWindSpeed(int speed)
   {
      super.windSpeed = speed;
      if(speed < SEVERE)
         super.severity = false;
      else
         super.severity = true;;
   }
}