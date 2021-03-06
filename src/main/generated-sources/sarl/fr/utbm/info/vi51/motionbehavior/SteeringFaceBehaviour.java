package fr.utbm.info.vi51.motionbehavior;

import fr.utbm.drone.environment.motions.BehaviourOutput;
import fr.utbm.drone.environment.motions.FaceBehaviour;
import fr.utbm.drone.maths.Point3f;
import fr.utbm.drone.maths.Vector3f;
import fr.utbm.info.vi51.motionbehavior.SteeringAlignBehaviour;
import io.sarl.lang.annotation.SarlSpecification;

@SarlSpecification("0.4")
@SuppressWarnings("all")
public class SteeringFaceBehaviour implements FaceBehaviour {
  private final SteeringAlignBehaviour align;
  
  public SteeringFaceBehaviour(final SteeringAlignBehaviour align) {
    this.align = align;
  }
  
  @Override
  public BehaviourOutput runFace(final Point3f position, final Vector3f orientation, final float angularSpeed, final float maxAngularAcceleration, final Point3f target) {
    Vector3f alignTarget = target.operator_minus(position);
    return this.align.runAlign(orientation, angularSpeed, maxAngularAcceleration, alignTarget);
  }
}
