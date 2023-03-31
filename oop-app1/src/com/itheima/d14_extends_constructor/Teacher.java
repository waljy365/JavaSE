package com.itheima.d14_extends_constructor;

/**
 * @author : 王希辰
 * @date : 2023/2/25 16:45
 */
public class Teacher extends People{
    private String skill;

    public Teacher() {
    }

    public Teacher(String name,int age,String skill) {
        // super(name,age);

        this.skill = skill;
        super.setAge(age);
        super.setName(name);

    }

    /**
     * 获取
     * @return skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Teacher{name = " + getName() + ", age = " + getAge() +", skill = " + skill + "}";
    }
}
