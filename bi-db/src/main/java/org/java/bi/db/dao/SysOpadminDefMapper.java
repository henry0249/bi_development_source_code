package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.SysOpadminDef;
import org.java.bi.db.domain.SysOpadminDefExample;

public interface SysOpadminDefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    long countByExample(SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int deleteByExample(SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int insert(SysOpadminDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int insertSelective(SysOpadminDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysOpadminDef selectOneByExample(SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysOpadminDef selectOneByExampleSelective(@Param("example") SysOpadminDefExample example, @Param("selective") SysOpadminDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SysOpadminDef> selectByExampleSelective(@Param("example") SysOpadminDefExample example, @Param("selective") SysOpadminDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    List<SysOpadminDef> selectByExample(SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysOpadminDef selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysOpadminDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    SysOpadminDef selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysOpadminDef selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysOpadminDef record, @Param("example") SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysOpadminDef record, @Param("example") SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysOpadminDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysOpadminDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysOpadminDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_opadmin_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}