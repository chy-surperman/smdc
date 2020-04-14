package com.chy.smdc.bean;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rolecode
     *
     * @mbggenerated
     */
    private String rolecode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rolecode
     *
     * @return the value of role.rolecode
     *
     * @mbggenerated
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rolecode
     *
     * @param rolecode the value for role.rolecode
     *
     * @mbggenerated
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.description
     *
     * @return the value of role.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.description
     *
     * @param description the value for role.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.sort
     *
     * @return the value of role.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.sort
     *
     * @param sort the value for role.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}