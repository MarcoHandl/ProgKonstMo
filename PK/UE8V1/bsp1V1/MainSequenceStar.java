package bsp1V1;

public class MainSequenceStar implements Star {

	private int state;
	private String stateTxt;
	private double mass;
	private int surfaceTemperature;
	private int surfaceGravitationalAcceleration; //Fallbeschleunigung (Erde 9,81 m/s²) Formel g=MasseDesHimmelskörpers/dessen Radius²
	private int size; //durchmesser
	private int intrinsicBrightness; //spezifische helligkeit hier in %
	
	public MainSequenceStar(double mass) {
		super();
		this.mass = mass;
		this.state = 0;
		this.surfaceTemperature = 15;
		this.size = (int)(mass * 1000);
		this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
		this.intrinsicBrightness = 10;
	}
	
	private int calcSurfaceGravitationalAcceleration(){
		return (int)(this.mass / ((size/2)*(size/2)));
	}

	@Override
	public void advanceTime() throws OutOfTime {
		switch (this.state) {
		case 0: //Gaswolke
			this.state = 1;
			stateTxt = "Hauptreihenstern";
			this.mass = this.mass * 0.95;
			this.surfaceTemperature = 5775;
			this.size = (int)(mass/1000);
			this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
			this.intrinsicBrightness = 5;
			break;
		case 1: //Hauptreihenstern
			this.mass = this.mass * 0.90;
			if(this.mass < 0.6){
				this.state = 2;
				stateTxt = "Weißer Zwerg";
				this.surfaceTemperature = 80000;
				this.size = (int)(mass/100);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 3;
			}else{
				this.state = 3;
				stateTxt = "Roter Riesenstern";
				this.surfaceTemperature = 15000;
				this.size = (int)(mass/500);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 8;
			}
			break;
		case 2: //Weißer Zwerg
			throw new OutOfTime();
		case 3: //Roter Riesenstern
			this.mass = this.mass * 0.90;
			if(this.mass < 1.44){
				this.state = 2;
				stateTxt = "Weißer Zwerg";
				this.surfaceTemperature = 80000;
				this.size = (int)(mass/100);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 3;
			}else{
				this.state = 3;
				stateTxt = "Supernova";
				this.surfaceTemperature = 30000;
				this.size = (int)(mass/300);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 12;
			}
			break;
		case 4: //Supernova
			this.mass = this.mass * 0.90;
			if(this.mass < 3){
				this.state = 6;
				stateTxt = "Neutronenstern";
				this.surfaceTemperature = 300;
				this.size = (int)(mass/3000);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 1;
			}else{
				this.state = 5;
				stateTxt = "Schwarzes Loch";
				this.surfaceTemperature = 300;
				this.size = (int)(mass/300000);
				this.surfaceGravitationalAcceleration = calcSurfaceGravitationalAcceleration();
				this.intrinsicBrightness = 0;
			}
			break;
		case 5: //Schwarzes Loch
			throw new OutOfTime();
		case 6: //Neutronenstern
			throw new OutOfTime();
		default: //error nicht spezifiziert
			System.out.println("error kann diesen Status gibt es nicht");
		}
		

		assert(stateTxt != "");
		assert(mass >= 0);
		assert(surfaceTemperature > 1);
		assert(surfaceGravitationalAcceleration >= 0);
		assert(size >= 0);
		assert(intrinsicBrightness >= 0);
	}

	@Override
	public int getSurfaceTemperature() {
		return this.surfaceTemperature;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		return this.surfaceGravitationalAcceleration;
	}

	@Override
	public double getMass() {
		return this.mass;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public int getIntrinsicBrightness() {
		return this.intrinsicBrightness;
	}

	@Override
	public String toString() {
		return "MainSequenceStar [state=" + state + ", stateTxt=" + stateTxt
				+ ", mass=" + mass + ", surfaceTemperature="
				+ surfaceTemperature + ", surfaceGravitationalAcceleration="
				+ surfaceGravitationalAcceleration + ", size=" + size
				+ ", intrinsicBrightness=" + intrinsicBrightness + "]";
	}
}
