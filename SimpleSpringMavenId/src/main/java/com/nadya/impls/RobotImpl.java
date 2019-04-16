package com.nadya.impls;

import com.nadya.inrefaces.*;

public class RobotImpl implements Robot {
    private String name;
    private String model;
    private Body body;
    private Head head;
    private RightHand rightHand;
    private RightLeg rightLeg;

    public RobotImpl() {
    }

    public RobotImpl(String name, String model, Body body, Head head, RightHand rightHand, RightLeg rightLeg) {
        this.name = name;
        this.model = model;
        this.body = body;
        this.head = head;
        this.rightHand = rightHand;
        this.rightLeg = rightLeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public RightHand getRightHand() {
        return rightHand;
    }

    public void setRightHand(RightHand rightHand) {
        this.rightHand = rightHand;
    }

    public RightLeg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(RightLeg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public void fire() {
        System.out.println("Robot description - Fire!" + this);
        body.include();
        head.think();
        rightHand.hold();
        rightLeg.move();
    }

    public void init() {
        System.out.println(this);
    }

    public void destroyMethod() {
        System.out.println("Destroy" + this);
    }
}
