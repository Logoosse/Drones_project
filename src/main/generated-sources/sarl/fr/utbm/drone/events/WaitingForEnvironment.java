package fr.utbm.drone.events;

import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.4")
@SuppressWarnings("all")
public class WaitingForEnvironment extends Event {
  /**
   * Construct an event. The source of the event is unknown.
   */
  @SyntheticMember
  public WaitingForEnvironment() {
    super();
  }
  
  /**
   * Construct an event.
   * @param source - address of the agent that is emitting this event.
   */
  @SyntheticMember
  public WaitingForEnvironment(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
