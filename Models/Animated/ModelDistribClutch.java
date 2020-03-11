// Date: 27/01/2020 4:41:23 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelDistribClutch extends RotaryModelBase
{
	//fields
	LODModelPart Shape1a;
	LODModelPart Shape2a;
	LODModelPart Shape2c;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape4R;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5Rb;
	LODModelPart Shape5RR;
	LODModelPart Shape5RRR;
	LODModelPart Shape4RRR;
	LODModelPart Shape4RR;
	LODModelPart Shape51R;
	LODModelPart Shape51RR;
	LODModelPart Shape51RRR;
	LODModelPart Shape5R1;
	LODModelPart Shape41R;
	LODModelPart Shape41RR;
	LODModelPart Shape41RRR;
	LODModelPart Shape4R1;
	LODModelPart Shape7a;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape1a2;
	LODModelPart Shape1a4;
	LODModelPart Shape1a3;
	LODModelPart Shape5R;
	LODModelPart Shape5Rb2;
	LODModelPart Shapez2;
	LODModelPart Shapez;
	LODModelPart Shapez1;
	LODModelPart Shapebase;

	public ModelDistribClutch()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1a = new LODModelPart(this, 0, 57);
		Shape1a.addBox(0F, 0F, 0F, 1, 10, 1);
		Shape1a.setRotationPoint(-8F, 14F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 69, 17);
		Shape2a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2a.setRotationPoint(-7F, 23F, 7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 69, 17);
		Shape2c.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2c.setRotationPoint(-7F, 23F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 69, 0);
		Shape3b.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3b.setRotationPoint(-8F, 23F, -7F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 69, 0);
		Shape3c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape3c.setRotationPoint(7F, 23F, -7F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape4R = new LODModelPart(this, 60, 40);
		Shape4R.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape4R.setRotationPoint(0F, 16F, -3F);
		Shape4R.setTextureSize(128, 128);
		Shape4R.mirror = true;
		this.setRotation(Shape4R, 0F, 0F, 1.178097F);
		Shape4 = new LODModelPart(this, 0, 77);
		Shape4.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape4.setRotationPoint(0F, 16F, -8.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0.7853982F);
		Shape5 = new LODModelPart(this, 0, 12);
		Shape5.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5.setRotationPoint(3.5F, 16F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0.7853982F, 0F, 0F);
		Shape5Rb = new LODModelPart(this, 0, 87);
		Shape5Rb.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		Shape5Rb.setRotationPoint(-3.5F, 16F, 0F);
		Shape5Rb.setTextureSize(128, 128);
		Shape5Rb.mirror = true;
		this.setRotation(Shape5Rb, 0F, 0F, 0F);
		Shape5RR = new LODModelPart(this, 0, 0);
		Shape5RR.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape5RR.setRotationPoint(3F, 16F, 0F);
		Shape5RR.setTextureSize(128, 128);
		Shape5RR.mirror = true;
		this.setRotation(Shape5RR, 0.7853982F, 0F, 0F);
		Shape5RRR = new LODModelPart(this, 0, 12);
		Shape5RRR.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5RRR.setRotationPoint(3.5F, 16F, 0F);
		Shape5RRR.setTextureSize(128, 128);
		Shape5RRR.mirror = true;
		this.setRotation(Shape5RRR, 0F, 0F, 0F);
		Shape4RRR = new LODModelPart(this, 0, 77);
		Shape4RRR.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape4RRR.setRotationPoint(0F, 16F, -8.5F);
		Shape4RRR.setTextureSize(128, 128);
		Shape4RRR.mirror = true;
		this.setRotation(Shape4RRR, 0F, 0F, 0F);
		Shape4RR = new LODModelPart(this, 0, 77);
		Shape4RR.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape4RR.setRotationPoint(0F, 16F, 2.5F);
		Shape4RR.setTextureSize(128, 128);
		Shape4RR.mirror = true;
		this.setRotation(Shape4RR, 0F, 0F, 0F);
		Shape51R = new LODModelPart(this, 0, 12);
		Shape51R.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape51R.setRotationPoint(-8.5F, 16F, 0F);
		Shape51R.setTextureSize(128, 128);
		Shape51R.mirror = true;
		this.setRotation(Shape51R, 0F, 0F, 0F);
		Shape51RR = new LODModelPart(this, 0, 0);
		Shape51RR.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape51RR.setRotationPoint(3F, 16F, 0F);
		Shape51RR.setTextureSize(128, 128);
		Shape51RR.mirror = true;
		this.setRotation(Shape51RR, 0F, 0F, 0F);
		Shape51RRR = new LODModelPart(this, 0, 0);
		Shape51RRR.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape51RRR.setRotationPoint(-4F, 16F, 0F);
		Shape51RRR.setTextureSize(128, 128);
		Shape51RRR.mirror = true;
		this.setRotation(Shape51RRR, 0F, 0F, 0F);
		Shape5R1 = new LODModelPart(this, 0, 0);
		Shape5R1.addBox(0F, -2F, -2F, 1, 4, 4);
		Shape5R1.setRotationPoint(-4F, 16F, 0F);
		Shape5R1.setTextureSize(128, 128);
		Shape5R1.mirror = true;
		this.setRotation(Shape5R1, 0.7853982F, 0F, 0F);
		Shape41R = new LODModelPart(this, 0, 77);
		Shape41R.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape41R.setRotationPoint(0F, 16F, 2.5F);
		Shape41R.setTextureSize(128, 128);
		Shape41R.mirror = true;
		this.setRotation(Shape41R, 0F, 0F, 0.7853982F);
		Shape41RR = new LODModelPart(this, 60, 40);
		Shape41RR.addBox(-2.5F, -2.5F, 0F, 5, 5, 1);
		Shape41RR.setRotationPoint(0F, 16F, -3F);
		Shape41RR.setTextureSize(128, 128);
		Shape41RR.mirror = true;
		this.setRotation(Shape41RR, 0F, 0F, 0.3926991F);
		Shape41RRR = new LODModelPart(this, 40, 40);
		Shape41RRR.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape41RRR.setRotationPoint(0F, 16F, 2F);
		Shape41RRR.setTextureSize(128, 128);
		Shape41RRR.mirror = true;
		this.setRotation(Shape41RRR, 0F, 0F, 0.3926991F);
		Shape4R1 = new LODModelPart(this, 40, 40);
		Shape4R1.addBox(-3F, -3F, 0F, 6, 6, 1);
		Shape4R1.setRotationPoint(0F, 16F, 2F);
		Shape4R1.setTextureSize(128, 128);
		Shape4R1.mirror = true;
		this.setRotation(Shape4R1, 0F, 0F, 1.178097F);
		Shape7a = new LODModelPart(this, 6, 42);
		Shape7a.addBox(0F, 0F, 0F, 1, 8, 14);
		Shape7a.setRotationPoint(7F, 13F, -7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7c = new LODModelPart(this, 0, 19);
		Shape7c.addBox(0F, 0F, 0F, 1, 8, 14);
		Shape7c.setRotationPoint(-8F, 13F, -7F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape7d = new LODModelPart(this, 32, 28);
		Shape7d.addBox(0F, 0F, 0F, 14, 8, 1);
		Shape7d.setRotationPoint(-7F, 13F, -8F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, 0F, 0F);
		Shape7e = new LODModelPart(this, 32, 14);
		Shape7e.addBox(0F, 0F, 0F, 14, 8, 1);
		Shape7e.setRotationPoint(-7F, 13F, 7F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0F, 0F);
		Shape1a2 = new LODModelPart(this, 0, 57);
		Shape1a2.addBox(0F, 0F, 0F, 1, 10, 1);
		Shape1a2.setRotationPoint(-8F, 14F, 7F);
		Shape1a2.setTextureSize(128, 128);
		Shape1a2.mirror = true;
		this.setRotation(Shape1a2, 0F, 0F, 0F);
		Shape1a4 = new LODModelPart(this, 0, 57);
		Shape1a4.addBox(0F, 0F, 0F, 1, 10, 1);
		Shape1a4.setRotationPoint(7F, 14F, 7F);
		Shape1a4.setTextureSize(128, 128);
		Shape1a4.mirror = true;
		this.setRotation(Shape1a4, 0F, 0F, 0F);
		Shape1a3 = new LODModelPart(this, 0, 57);
		Shape1a3.addBox(0F, 0F, 0F, 1, 10, 1);
		Shape1a3.setRotationPoint(7F, 14F, -8F);
		Shape1a3.setTextureSize(128, 128);
		Shape1a3.mirror = true;
		this.setRotation(Shape1a3, 0F, 0F, 0F);
		Shape5R = new LODModelPart(this, 0, 12);
		Shape5R.addBox(0F, -1F, -1F, 5, 2, 2);
		Shape5R.setRotationPoint(-8.5F, 16F, 0F);
		Shape5R.setTextureSize(128, 128);
		Shape5R.mirror = true;
		this.setRotation(Shape5R, 0.7853982F, 0F, 0F);
		Shape5Rb2 = new LODModelPart(this, 0, 87);
		Shape5Rb2.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		Shape5Rb2.setRotationPoint(-3.5F, 16F, 0F);
		Shape5Rb2.setTextureSize(128, 128);
		Shape5Rb2.mirror = true;
		this.setRotation(Shape5Rb2, 0.7853982F, 0F, 0F);
		Shapez2 = new LODModelPart(this, 22, 0);
		Shapez2.addBox(0F, 0F, -1.5F, 1, 10, 3);
		Shapez2.setRotationPoint(5F, 14F, 0F);
		Shapez2.setTextureSize(128, 128);
		Shapez2.mirror = true;
		this.setRotation(Shapez2, 0F, 0F, 0F);
		Shapez = new LODModelPart(this, 15, 0);
		Shapez.addBox(-0.5F, 0F, -1F, 1, 10, 2);
		Shapez.setRotationPoint(0F, 14F, 0F);
		Shapez.setTextureSize(128, 128);
		Shapez.mirror = true;
		this.setRotation(Shapez, 0F, 0F, 0F);
		Shapez1 = new LODModelPart(this, 22, 0);
		Shapez1.addBox(0F, 0F, -1.5F, 1, 10, 3);
		Shapez1.setRotationPoint(-6F, 14F, 0F);
		Shapez1.setTextureSize(128, 128);
		Shapez1.mirror = true;
		this.setRotation(Shapez1, 0F, 0F, 0F);
		Shapebase = new LODModelPart(this, 38, 49);
		Shapebase.addBox(0F, 0F, 0F, 14, 1, 14);
		Shapebase.setRotationPoint(-7F, 23F, -7F);
		Shapebase.setTextureSize(128, 128);
		Shapebase.mirror = true;
		this.setRotation(Shapebase, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
		Shape1a.render(f5);
		Shape1a2.render(f5);
		Shape1a4.render(f5);
		Shape1a3.render(f5);

		Shape2a.render(f5);
		Shape2c.render(f5);
		Shape3b.render(f5);
		Shape3c.render(f5);

		Shape7a.render(f5);
		Shape7c.render(f5);
		Shape7d.render(f5);
		Shape7e.render(f5);
		Shapebase.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		Shape4R.render(f5);
		Shape4.render(f5);
		Shape4RRR.render(f5);
		Shape4RR.render(f5);
		Shape41R.render(f5);
		Shape41RR.render(f5);
		Shape41RRR.render(f5);
		Shape4R1.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		Shape5R.render(f5);
		Shape51R.render(f5);
		Shape5Rb.render(f5);
		Shape5Rb2.render(f5);
		Shape51RRR.render(f5);
		Shape5R1.render(f5);
		Shape5RR.render(f5);
		Shape51RR.render(f5);
		Shape5.render(f5);
		Shape5RRR.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		Shapez2.render(f5);
		Shapez.render(f5);
		Shapez1.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}