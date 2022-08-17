package trash.foodbyte.event;

import obfuscate.a;
import org.lwjgl.input.Mouse;

public class MouseEvent extends UnknownEvent {
   public final int eventX = Mouse.getEventX();
   public int eventY;
   public int eventDX;
   public int eventDY;
   public int eventDWheel;
   public int eventButton;
   public boolean eventButtonState;
   public long eventNanosecounds;

   public MouseEvent() {
      EventPacket.trash();
      this.eventY = Mouse.getEventY();
      this.eventDX = Mouse.getEventDX();
      this.eventDY = Mouse.getEventDY();
      this.eventDWheel = Mouse.getEventDWheel();
      this.eventButton = Mouse.getEventButton();
      this.eventButtonState = Mouse.getEventButtonState();
      this.eventNanosecounds = Mouse.getEventNanoseconds();
      if (a.trash() == null) {
         EventPacket.trash(new String[4]);
      }

   }
}
