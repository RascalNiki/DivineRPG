package divinerpg.client.models.boss;

import com.google.common.collect.*;
import divinerpg.entities.boss.*;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraft.client.renderer.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class ModelQuadro<T extends Entity> extends SegmentedModel<T>
{
    //fields
    ModelRenderer rightlegt;
    ModelRenderer leftlegt;
    ModelRenderer rotated1;
    ModelRenderer rotated2;
    ModelRenderer rotated3;
    ModelRenderer rotated4;
    ModelRenderer rotated5;
    ModelRenderer rotated6;
    ModelRenderer rotated7;
    ModelRenderer rotated8;
    ModelRenderer rotated9;
    ModelRenderer rotated10;
    ModelRenderer rotated11;
    ModelRenderer rotated12;
    ModelRenderer rotated13;
    ModelRenderer rotated14;
    ModelRenderer rotated15;
    ModelRenderer rotated16;
    ModelRenderer rotated17;
    ModelRenderer rotated18;
    ModelRenderer righttoe1;
    ModelRenderer lefttoe1;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer lefttoe2;
    ModelRenderer righttoe2;
    ModelRenderer rotated19;
    ModelRenderer rotated20;
    ModelRenderer rotated21;
    ModelRenderer rotated22;
    ModelRenderer rotated23;
    ModelRenderer rotated24;
    ModelRenderer rotated25;
    ModelRenderer rotated26;
    ModelRenderer rotated27;
    ModelRenderer rotated28;
    ModelRenderer rotated29;
    ModelRenderer rotated30;
    ModelRenderer rotated31;
    ModelRenderer rotated32;
    ModelRenderer rotated33;
    ModelRenderer rotated34;
    ModelRenderer rotated35;
    ModelRenderer rotated36;
    ModelRenderer rotated37;
    ModelRenderer rotated38;
    ModelRenderer rotated39;
    ModelRenderer rotated40;
    ModelRenderer rotated41;
    ModelRenderer rotated42;
    ModelRenderer rotated43;
    ModelRenderer rotated44;
    ModelRenderer rotated45;
    ModelRenderer rotated46;
    ModelRenderer rotated47;
    ModelRenderer rotated48;
    ModelRenderer rotated49;
    ModelRenderer rotated50;
    ModelRenderer rotated51;
    ModelRenderer rotated52;
    ModelRenderer rotated53;
    ModelRenderer rotated54;
    ModelRenderer rotated55;
    ModelRenderer rotated56;
    ModelRenderer rotated58;
    private float rotateOffset;
    private int dir;

    public ModelQuadro()
    {
        texWidth = 128;
        texHeight = 32;

        rightlegt = new ModelRenderer(this, 101, 16);
        rightlegt.addBox(-4F, -4F, -3F, 6, 4, 6);
        rightlegt.setPos(-7F, 12F, 0F);
        rightlegt.setTexSize(128, 32);
        rightlegt.mirror = true;
        setRotation(rightlegt, 0F, 0F, 0F);
        leftlegt = new ModelRenderer(this, 101, 16);
        leftlegt.addBox(-3F, -4F, -3F, 6, 4, 6);
        leftlegt.setPos(8F, 12F, 0F);
        leftlegt.setTexSize(128, 32);
        leftlegt.mirror = true;
        setRotation(leftlegt, 0F, 0F, 0F);
        rotated1 = new ModelRenderer(this, 82, 16);
        rotated1.addBox(4F, -16F, -14F, 4, 12, 4);
        rotated1.setPos(1F, 14F, 0F);
        rotated1.setTexSize(128, 32);
        rotated1.mirror = true;
        setRotation(rotated1, -0.1745329F, -1.570796F, 0F);
        rotated2 = new ModelRenderer(this, 82, 16);
        rotated2.addBox(-8F, -15F, -14F, 4, 12, 4);
        rotated2.setPos(-1F, 13F, 0F);
        rotated2.setTexSize(128, 32);
        rotated2.mirror = true;
        setRotation(rotated2, -0.1745329F, -1.570796F, 0F);
        rotated3 = new ModelRenderer(this, 34, 0);
        rotated3.addBox(-3F, -18F, -8F, 6, 12, 4);
        rotated3.setPos(0F, 12F, 0F);
        rotated3.setTexSize(128, 32);
        rotated3.mirror = true;
        setRotation(rotated3, 0.2617994F, -1.570796F, 0F);
        rotated4 = new ModelRenderer(this, 40, 16);
        rotated4.addBox(-6F, -15F, -9F, 4, 2, 2);
        rotated4.setPos(-1F, 12F, 0F);
        rotated4.setTexSize(128, 32);
        rotated4.mirror = true;
        setRotation(rotated4, 0F, -3.141593F, 0F);
        rotated5 = new ModelRenderer(this, 40, 16);
        rotated5.addBox(2F, -16F, -9F, 4, 2, 2);
        rotated5.setPos(1F, 14F, 0F);
        rotated5.setTexSize(128, 32);
        rotated5.mirror = true;
        setRotation(rotated5, 0F, -3.141593F, 0F);
        rotated6 = new ModelRenderer(this, 56, 1);
        rotated6.addBox(-4F, -10F, -9F, 8, 7, 6);
        rotated6.setPos(0F, 12F, 0F);
        rotated6.setTexSize(128, 32);
        rotated6.mirror = true;
        setRotation(rotated6, 0.2617994F, -1.570796F, 0F);
        rotated7 = new ModelRenderer(this, 0, 0);
        rotated7.addBox(-4F, -25F, -11F, 8, 8, 8);
        rotated7.setPos(0F, 12F, 0F);
        rotated7.setTexSize(128, 32);
        rotated7.mirror = true;
        setRotation(rotated7, 0.1745329F, -1.570796F, 0F);
        rotated8 = new ModelRenderer(this, 0, 0);
        rotated8.addBox(-4F, -25F, -12F, 8, 8, 8);
        rotated8.setPos(0F, 12F, 0F);
        rotated8.setTexSize(128, 32);
        rotated8.mirror = true;
        setRotation(rotated8, 0.1745329F, 1.570796F, 0F);
        rotated9 = new ModelRenderer(this, 82, 16);
        rotated9.addBox(4F, -16F, -15F, 4, 12, 4);
        rotated9.setPos(1F, 14F, 0F);
        rotated9.setTexSize(128, 32);
        rotated9.mirror = true;
        setRotation(rotated9, -0.1745329F, 1.570796F, 0F);
        rotated10 = new ModelRenderer(this, 40, 16);
        rotated10.addBox(-6F, -15F, -12F, 4, 2, 2);
        rotated10.setPos(-1F, 13F, 0F);
        rotated10.setTexSize(128, 32);
        rotated10.mirror = true;
        setRotation(rotated10, 0F, 1.570796F, 0F);
        rotated11 = new ModelRenderer(this, 40, 16);
        rotated11.addBox(2F, -16F, -12F, 4, 2, 2);
        rotated11.setPos(1F, 14F, 0F);
        rotated11.setTexSize(128, 32);
        rotated11.mirror = true;
        setRotation(rotated11, 0F, 1.570796F, 0F);
        rotated12 = new ModelRenderer(this, 55, 22);
        rotated12.addBox(5F, -7F, -19F, 2, 2, 8);
        rotated12.setPos(1F, 14F, 0F);
        rotated12.setTexSize(128, 32);
        rotated12.mirror = true;
        setRotation(rotated12, -0.1745329F, 3.141593F, 0F);
        rotated13 = new ModelRenderer(this, 59, 26);
        rotated13.addBox(-18F, -9F, -3F, 2, 2, 4);
        rotated13.setPos(-1F, 13F, 0F);
        rotated13.setTexSize(128, 32);
        rotated13.mirror = true;
        setRotation(rotated13, 0F, 1.570796F, 0F);
        rotated14 = new ModelRenderer(this, 86, 2);
        rotated14.addBox(-5F, -4F, 0F, 10, 4, 8);
        rotated14.setPos(0F, 12F, 0F);
        rotated14.setTexSize(128, 32);
        rotated14.mirror = true;
        setRotation(rotated14, 0F, 1.570796F, 0F);
        rotated15 = new ModelRenderer(this, 82, 16);
        rotated15.addBox(-8F, -15F, -15F, 4, 12, 4);
        rotated15.setPos(-1F, 13F, 0F);
        rotated15.setTexSize(128, 32);
        rotated15.mirror = true;
        setRotation(rotated15, -0.1745329F, 1.570796F, 0F);
        rotated16 = new ModelRenderer(this, 34, 0);
        rotated16.addBox(-3F, -18F, -9F, 6, 12, 4);
        rotated16.setPos(0F, 12F, 0F);
        rotated16.setTexSize(128, 32);
        rotated16.mirror = true;
        setRotation(rotated16, 0.2617994F, 1.570796F, 0F);
        rotated17 = new ModelRenderer(this, 56, 1);
        rotated17.addBox(-4F, -10F, -10F, 8, 7, 6);
        rotated17.setPos(0F, 12F, 0F);
        rotated17.setTexSize(128, 32);
        rotated17.mirror = true;
        setRotation(rotated17, 0.2617994F, 1.570796F, 0F);
        rotated18 = new ModelRenderer(this, 86, 2);
        rotated18.addBox(-5F, -4F, -8F, 10, 4, 8);
        rotated18.setPos(0F, 12F, 0F);
        rotated18.setTexSize(128, 32);
        rotated18.mirror = true;
        setRotation(rotated18, 0F, 1.570796F, 0F);
        righttoe1 = new ModelRenderer(this, 19, 17);
        righttoe1.addBox(1F, 9F, -10F, 2, 3, 12);
        righttoe1.setPos(-7F, 12F, 0F);
        righttoe1.setTexSize(128, 32);
        righttoe1.mirror = true;
        setRotation(righttoe1, 0F, 0F, 0F);
        lefttoe1 = new ModelRenderer(this, 19, 17);
        lefttoe1.addBox(2F, 9F, -10F, 2, 3, 12);
        lefttoe1.setPos(8F, 12F, 0F);
        lefttoe1.setTexSize(128, 32);
        lefttoe1.mirror = true;
        setRotation(lefttoe1, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setPos(8F, 12F, 0F);
        leftleg.setTexSize(128, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-3F, 0F, -2F, 4, 12, 4);
        rightleg.setPos(-7F, 12F, 0F);
        rightleg.setTexSize(128, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        lefttoe2 = new ModelRenderer(this, 19, 17);
        lefttoe2.addBox(-4F, 9F, -10F, 2, 3, 12);
        lefttoe2.setPos(8F, 12F, 0F);
        lefttoe2.setTexSize(128, 32);
        lefttoe2.mirror = true;
        setRotation(lefttoe2, 0F, 0F, 0F);
        righttoe2 = new ModelRenderer(this, 19, 17);
        righttoe2.addBox(-5F, 9F, -10F, 2, 3, 12);
        righttoe2.setPos(-7F, 12F, 0F);
        righttoe2.setTexSize(128, 32);
        righttoe2.mirror = true;
        setRotation(righttoe2, 0F, 0F, 0F);
        rotated19 = new ModelRenderer(this, 55, 22);
        rotated19.addBox(-7F, -6F, -19F, 2, 2, 8);
        rotated19.setPos(-1F, 13F, 0F);
        rotated19.setTexSize(128, 32);
        rotated19.mirror = true;
        setRotation(rotated19, -0.1745329F, 3.141593F, 0F);
        rotated20 = new ModelRenderer(this, 59, 26);
        rotated20.addBox(-18F, -9F, 1F, 2, 2, 4);
        rotated20.setPos(-1F, 13F, 0F);
        rotated20.setTexSize(128, 32);
        rotated20.mirror = true;
        setRotation(rotated20, 0F, 1.570796F, 0F);
        rotated21 = new ModelRenderer(this, 58, 24);
        rotated21.addBox(-19F, -9F, -7F, 2, 2, 6);
        rotated21.setPos(-1F, 13F, 0F);
        rotated21.setTexSize(128, 32);
        rotated21.mirror = true;
        setRotation(rotated21, 0F, -1.570796F, 0F);
        rotated22 = new ModelRenderer(this, 61, 28);
        rotated22.addBox(-22F, -11F, -1F, 6, 2, 2);
        rotated22.setPos(-1F, 13F, 0F);
        rotated22.setTexSize(128, 32);
        rotated22.mirror = true;
        setRotation(rotated22, 0F, 1.570796F, 0F);
        rotated23 = new ModelRenderer(this, 55, 22);
        rotated23.addBox(5F, -7F, -21F, 2, 2, 8);
        rotated23.setPos(1F, 14F, 0F);
        rotated23.setTexSize(128, 32);
        rotated23.mirror = true;
        setRotation(rotated23, -0.1745329F, -1.570796F, 0F);
        rotated24 = new ModelRenderer(this, 55, 22);
        rotated24.addBox(-7F, -6F, -37F, 2, 2, 8);
        rotated24.setPos(-1F, 13F, 0F);
        rotated24.setTexSize(128, 32);
        rotated24.mirror = true;
        setRotation(rotated24, -0.1745329F, 1.570796F, 0F);
        rotated25 = new ModelRenderer(this, 58, 24);
        rotated25.addBox(-19F, -9F, -1F, 2, 2, 6);
        rotated25.setPos(-1F, 13F, 0F);
        rotated25.setTexSize(128, 32);
        rotated25.mirror = true;
        setRotation(rotated25, 0F, -1.570796F, 0F);
        rotated26 = new ModelRenderer(this, 61, 28);
        rotated26.addBox(-22F, -11F, 1F, 6, 2, 2);
        rotated26.setPos(-1F, 13F, 0F);
        rotated26.setTexSize(128, 32);
        rotated26.mirror = true;
        setRotation(rotated26, 0F, 1.570796F, 0F);
        rotated27 = new ModelRenderer(this, 61, 28);
        rotated27.addBox(-23F, -11F, -7F, 6, 2, 2);
        rotated27.setPos(-1F, 13F, 0F);
        rotated27.setTexSize(128, 32);
        rotated27.mirror = true;
        setRotation(rotated27, 0F, -1.570796F, 0F);
        rotated28 = new ModelRenderer(this, 61, 28);
        rotated28.addBox(-23F, -11F, 2F, 6, 2, 2);
        rotated28.setPos(-1F, 13F, 0F);
        rotated28.setTexSize(128, 32);
        rotated28.mirror = true;
        setRotation(rotated28, 0F, -1.570796F, 0F);
        rotated29 = new ModelRenderer(this, 61, 28);
        rotated29.addBox(-22F, -13F, 1F, 6, 2, 2);
        rotated29.setPos(-1F, 13F, 0F);
        rotated29.setTexSize(128, 32);
        rotated29.mirror = true;
        setRotation(rotated29, 0F, 1.570796F, 0F);
        rotated30 = new ModelRenderer(this, 61, 28);
        rotated30.addBox(-22F, -13F, -1F, 6, 2, 2);
        rotated30.setPos(-1F, 13F, 0F);
        rotated30.setTexSize(128, 32);
        rotated30.mirror = true;
        setRotation(rotated30, 0F, 1.570796F, 0F);
        rotated31 = new ModelRenderer(this, 61, 28);
        rotated31.addBox(-23F, -7F, -7F, 6, 2, 2);
        rotated31.setPos(-1F, 13F, 0F);
        rotated31.setTexSize(128, 32);
        rotated31.mirror = true;
        setRotation(rotated31, 0F, -1.570796F, 0F);
        rotated32 = new ModelRenderer(this, 61, 28);
        rotated32.addBox(-23F, -7F, 2F, 6, 2, 2);
        rotated32.setPos(-1F, 13F, 0F);
        rotated32.setTexSize(128, 32);
        rotated32.mirror = true;
        setRotation(rotated32, 0F, -1.570796F, 0F);
        rotated33 = new ModelRenderer(this, 61, 28);
        rotated33.addBox(-22F, -7F, 1F, 6, 2, 2);
        rotated33.setPos(-1F, 13F, 0F);
        rotated33.setTexSize(128, 32);
        rotated33.mirror = true;
        setRotation(rotated33, 0F, 1.570796F, 0F);
        rotated34 = new ModelRenderer(this, 61, 28);
        rotated34.addBox(-22F, -7F, -1F, 6, 2, 2);
        rotated34.setPos(-1F, 13F, 0F);
        rotated34.setTexSize(128, 32);
        rotated34.mirror = true;
        setRotation(rotated34, 0F, 1.570796F, 0F);
        rotated35 = new ModelRenderer(this, 61, 28);
        rotated35.addBox(-22F, -5F, -1F, 6, 2, 2);
        rotated35.setPos(-1F, 13F, 0F);
        rotated35.setTexSize(128, 32);
        rotated35.mirror = true;
        setRotation(rotated35, 0F, 1.570796F, 0F);
        rotated36 = new ModelRenderer(this, 61, 28);
        rotated36.addBox(-22F, -5F, 1F, 6, 2, 2);
        rotated36.setPos(-1F, 13F, 0F);
        rotated36.setTexSize(128, 32);
        rotated36.mirror = true;
        setRotation(rotated36, 0F, 1.570796F, 0F);
        rotated37 = new ModelRenderer(this, 82, 16);
        rotated37.addBox(-8F, -15F, -12F, 4, 12, 4);
        rotated37.setPos(-1F, 13F, 0F);
        rotated37.setTexSize(128, 32);
        rotated37.mirror = true;
        setRotation(rotated37, -0.1745329F, -3.141593F, 0F);
        rotated38 = new ModelRenderer(this, 34, 0);
        rotated38.addBox(-3F, -18F, -6F, 6, 12, 4);
        rotated38.setPos(0F, 12F, 0F);
        rotated38.setTexSize(128, 32);
        rotated38.mirror = true;
        setRotation(rotated38, 0.2617994F, -3.141593F, 0F);
        rotated39 = new ModelRenderer(this, 82, 16);
        rotated39.addBox(4F, -16F, -12F, 4, 12, 4);
        rotated39.setPos(1F, 14F, 0F);
        rotated39.setTexSize(128, 32);
        rotated39.mirror = true;
        setRotation(rotated39, -0.1745329F, -3.141593F, 0F);
        rotated40 = new ModelRenderer(this, 0, 0);
        rotated40.addBox(-4F, -25F, -9F, 8, 8, 8);
        rotated40.setPos(0F, 12F, 0F);
        rotated40.setTexSize(128, 32);
        rotated40.mirror = true;
        setRotation(rotated40, 0.1745329F, -3.141593F, 0F);
        rotated41 = new ModelRenderer(this, 56, 1);
        rotated41.addBox(-4F, -10F, -7F, 8, 7, 6);
        rotated41.setPos(0F, 12F, 0F);
        rotated41.setTexSize(128, 32);
        rotated41.mirror = true;
        setRotation(rotated41, 0.2617994F, -3.141593F, 0F);
        rotated42 = new ModelRenderer(this, 86, 2);
        rotated42.addBox(-5F, -4F, 0F, 10, 4, 8);
        rotated42.setPos(0F, 12F, 0F);
        rotated42.setTexSize(128, 32);
        rotated42.mirror = true;
        setRotation(rotated42, 0F, 0F, 0F);
        rotated43 = new ModelRenderer(this, 82, 16);
        rotated43.addBox(4F, -16F, -13F, 4, 12, 4);
        rotated43.setPos(1F, 14F, 0F);
        rotated43.setTexSize(128, 32);
        rotated43.mirror = true;
        setRotation(rotated43, -0.1745329F, 0F, 0F);
        rotated44 = new ModelRenderer(this, 56, 1);
        rotated44.addBox(-4F, -10F, -8F, 8, 7, 6);
        rotated44.setPos(0F, 12F, 0F);
        rotated44.setTexSize(128, 32);
        rotated44.mirror = true;
        setRotation(rotated44, 0.2617994F, 0F, 0F);
        rotated45 = new ModelRenderer(this, 86, 2);
        rotated45.addBox(-5F, -4F, -8F, 10, 4, 8);
        rotated45.setPos(0F, 12F, 0F);
        rotated45.setTexSize(128, 32);
        rotated45.mirror = true;
        setRotation(rotated45, 0F, 0F, 0F);
        rotated46 = new ModelRenderer(this, 82, 16);
        rotated46.addBox(-8F, -15F, -13F, 4, 12, 4);
        rotated46.setPos(-1F, 13F, 0F);
        rotated46.setTexSize(128, 32);
        rotated46.mirror = true;
        setRotation(rotated46, -0.1745329F, 0F, 0F);
        rotated47 = new ModelRenderer(this, 34, 0);
        rotated47.addBox(-3F, -18F, -7F, 6, 12, 4);
        rotated47.setPos(0F, 12F, 0F);
        rotated47.setTexSize(128, 32);
        rotated47.mirror = true;
        setRotation(rotated47, 0.2617994F, 0F, 0F);
        rotated48 = new ModelRenderer(this, 0, 0);
        rotated48.addBox(-4F, -25F, -10F, 8, 8, 8);
        rotated48.setPos(0F, 12F, 0F);
        rotated48.setTexSize(128, 32);
        rotated48.mirror = true;
        setRotation(rotated48, 0.1745329F, 0F, 0F);
        rotated49 = new ModelRenderer(this, 40, 16);
        rotated49.addBox(-6F, -15F, -11F, 4, 2, 2);
        rotated49.setPos(-1F, 13F, 0F);
        rotated49.setTexSize(128, 32);
        rotated49.mirror = true;
        setRotation(rotated49, 0F, -1.570796F, 0F);
        rotated50 = new ModelRenderer(this, 40, 16);
        rotated50.addBox(2F, -16F, -11F, 4, 2, 2);
        rotated50.setPos(1F, 14F, 0F);
        rotated50.setTexSize(128, 32);
        rotated50.mirror = true;
        setRotation(rotated50, 0F, -1.570796F, 0F);
        rotated51 = new ModelRenderer(this, 40, 16);
        rotated51.addBox(2F, -16F, -10F, 4, 2, 2);
        rotated51.setPos(1F, 14F, 0F);
        rotated51.setTexSize(128, 32);
        rotated51.mirror = true;
        setRotation(rotated51, 0F, 0F, 0F);
        rotated52 = new ModelRenderer(this, 40, 16);
        rotated52.addBox(-6F, -15F, -10F, 4, 2, 2);
        rotated52.setPos(-1F, 13F, 0F);
        rotated52.setTexSize(128, 32);
        rotated52.mirror = true;
        setRotation(rotated52, 0F, 0F, 0F);
        rotated53 = new ModelRenderer(this, 55, 22);
        rotated53.addBox(-7F, -6F, -21F, 2, 2, 8);
        rotated53.setPos(-1F, 13F, 0F);
        rotated53.setTexSize(128, 32);
        rotated53.mirror = true;
        setRotation(rotated53, -0.1745329F, -1.570796F, 0F);
        rotated54 = new ModelRenderer(this, 55, 22);
        rotated54.addBox(-7F, -6F, -21F, 2, 2, 8);
        rotated54.setPos(-1F, 13F, 0F);
        rotated54.setTexSize(128, 32);
        rotated54.mirror = true;
        setRotation(rotated54, -0.1745329F, 1.570796F, 0F);
        rotated55 = new ModelRenderer(this, 55, 22);
        rotated55.addBox(-7F, -6F, -21F, 2, 2, 8);
        rotated55.setPos(-1F, 13F, 0F);
        rotated55.setTexSize(128, 32);
        rotated55.mirror = true;
        setRotation(rotated55, -0.1745329F, 0F, 0F);
        rotated56 = new ModelRenderer(this, 55, 22);
        rotated56.addBox(5F, -7F, -21F, 2, 2, 8);
        rotated56.setPos(1F, 14F, 0F);
        rotated56.setTexSize(128, 32);
        rotated56.mirror = true;
        setRotation(rotated56, -0.1745329F, 0F, 0F);
        rotated58 = new ModelRenderer(this, 55, 22);
        rotated58.addBox(-7F, -6F, -29F, 2, 2, 8);
        rotated58.setPos(-1F, 13F, 0F);
        rotated58.setTexSize(128, 32);
        rotated58.mirror = true;
        setRotation(rotated58, -0.1745329F, 1.570796F, 0F);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(rightlegt, leftlegt, rotated1, rotated2, rotated3, rotated4, rotated5, rotated6, rotated7, rotated8, rotated9,
                rotated10, rotated11, rotated12, rotated13, rotated14, rotated15, rotated16, rotated17, rotated18, righttoe1, lefttoe1, leftleg,
                rightleg, lefttoe2, righttoe2, rotated19, rotated20, rotated21, rotated22, rotated23, rotated24, rotated25, rotated26, rotated27,
                rotated28, rotated29, rotated30, rotated31, rotated32, rotated33, rotated34, rotated35, rotated36, rotated37, rotated38, rotated39,
                rotated40, rotated41, rotated42, rotated43, rotated44, rotated45, rotated46, rotated47, rotated48, rotated49, rotated50, rotated51,
                rotated52, rotated53, rotated54, rotated55, rotated56, rotated58);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }

    @Override
    public void prepareMobModel(T entity, float f, float f1, float f2) {
        if (entity instanceof EntityQuadro) {
            this.leftleg.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
            this.leftlegt.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
            this.lefttoe1.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
            this.lefttoe2.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

            this.rightleg.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
            this.rightleg.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
            this.righttoe1.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
            this.righttoe2.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
//            EntityQuadro quadro = (EntityQuadro) entity;
            if (((EntityQuadro) entity).dir == true) {
                this.dir = 0;
            }

            //TODO - sort quadro ability rotations
            int ageInSeconds = (int) (f2/20);
            if(ageInSeconds != 0) {
            	if (ageInSeconds % 18 <= 9) {
                    if (ageInSeconds % 6 == 0 && this.rotateOffset < Math.PI && this.dir == 0) {
                        this.rotateOffset = 0.05F;
                    } else if (ageInSeconds % 4 == 0 && this.rotateOffset < Math.PI * 3 / 2 /*&& this.dir == 0*/) {
                        this.rotateOffset = 0.05F;
                    } else if (ageInSeconds % 2 == 0 && this.rotateOffset < Math.PI / 2 /*&& this.dir == 0*/) {
                        this.rotateOffset = 0.05F;
                    } else {
//                        this.dir = 1;
                    	this.dir = 0;
                        this.rotateOffset = 0;
                }} else {

                    if (ageInSeconds % 8 == 0 && this.rotateOffset > Math.PI /*&& this.dir == 1*/) {
                        this.rotateOffset = -0.05F;
                    } else if (ageInSeconds % 6 == 0 && this.rotateOffset > Math.PI * 3 / 2 /*&& this.dir == 1*/) {
                        this.rotateOffset = -0.05F;
                    } else if (ageInSeconds % 4 == 0 && this.rotateOffset > Math.PI / 2 /*&& this.dir == 1*/) {
                        this.rotateOffset = -0.05F;
                    } else if (ageInSeconds % 2 == 0 && this.rotateOffset > 0 /*&& this.dir == 1*/) {
                        this.rotateOffset = -0.05F;
                    } else {
//                        this.dir = 2;
                    	this.dir = 0;
                        this.rotateOffset = 0;
            }}}

            this.rotated1.yRot += this.rotateOffset;
            this.rotated2.yRot += this.rotateOffset;
            this.rotated3.yRot += this.rotateOffset;
            this.rotated4.yRot += this.rotateOffset;
            this.rotated5.yRot += this.rotateOffset;
            this.rotated6.yRot += this.rotateOffset;
            this.rotated7.yRot += this.rotateOffset;
            this.rotated8.yRot += this.rotateOffset;
            this.rotated9.yRot += this.rotateOffset;
            this.rotated10.yRot += this.rotateOffset;
            this.rotated11.yRot += this.rotateOffset;
            this.rotated12.yRot += this.rotateOffset;
            this.rotated13.yRot += this.rotateOffset;
            this.rotated14.yRot += this.rotateOffset;
            this.rotated15.yRot += this.rotateOffset;
            this.rotated16.yRot += this.rotateOffset;
            this.rotated17.yRot += this.rotateOffset;
            this.rotated18.yRot += this.rotateOffset;
            this.rotated19.yRot += this.rotateOffset;
            this.rotated20.yRot += this.rotateOffset;
            this.rotated21.yRot += this.rotateOffset;
            this.rotated22.yRot += this.rotateOffset;
            this.rotated23.yRot += this.rotateOffset;
            this.rotated24.yRot += this.rotateOffset;
            this.rotated25.yRot += this.rotateOffset;
            this.rotated26.yRot += this.rotateOffset;
            this.rotated27.yRot += this.rotateOffset;
            this.rotated28.yRot += this.rotateOffset;
            this.rotated29.yRot += this.rotateOffset;
            this.rotated30.yRot += this.rotateOffset;
            this.rotated31.yRot += this.rotateOffset;
            this.rotated32.yRot += this.rotateOffset;
            this.rotated33.yRot += this.rotateOffset;
            this.rotated34.yRot += this.rotateOffset;
            this.rotated35.yRot += this.rotateOffset;
            this.rotated36.yRot += this.rotateOffset;
            this.rotated37.yRot += this.rotateOffset;
            this.rotated38.yRot += this.rotateOffset;
            this.rotated39.yRot += this.rotateOffset;
            this.rotated40.yRot += this.rotateOffset;
            this.rotated41.yRot += this.rotateOffset;
            this.rotated42.yRot += this.rotateOffset;
            this.rotated43.yRot += this.rotateOffset;
            this.rotated44.yRot += this.rotateOffset;
            this.rotated45.yRot += this.rotateOffset;
            this.rotated46.yRot += this.rotateOffset;
            this.rotated47.yRot += this.rotateOffset;
            this.rotated48.yRot += this.rotateOffset;
            this.rotated49.yRot += this.rotateOffset;
            this.rotated50.yRot += this.rotateOffset;
            this.rotated51.yRot += this.rotateOffset;
            this.rotated52.yRot += this.rotateOffset;
            this.rotated53.yRot += this.rotateOffset;
            this.rotated54.yRot += this.rotateOffset;
            this.rotated55.yRot += this.rotateOffset;
            this.rotated56.yRot += this.rotateOffset;
            this.rotated58.yRot += this.rotateOffset;
        }
    }
}
