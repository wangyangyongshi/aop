package aop;

import java.util.Date;

/**
 * POJO:ClassRebuild
 *
 * @author duia_builder
 * @date 2017-8-1
 */
public class ClassRebuild  {


    private Long studentId;         /* 学生id */
    private Long classStudentId;    /* 学员班级id */
    private String reason;         /* 重修原因 */
    private Date applyDate;         /* 申请日期 */
    private Integer applyStatus;         /* 申请状1：申请中； 2：重修完成；3：拒绝；4：教务审核通过；5：学员前台取消订单 */
    private Date approveDate;         /* 审批时间 */
    private String approveView;         /* 审批意见 */
    private Long approver;         /* 审批人（任务分配） */
    private Long oldClassId;         /* 原班班级id */
    private String oldClassNo;         /* 原始班级号 */
    private Long oldClassTypeId;         /* 原始班型id */
    private String oldClassTypeName;         /* 原始班型名称 */
    private String oldTeacherName;         /* 原始班级教师名称 */
    private Long newClassId;         /* 新班级id */
    private String newClassNo;         /* 新班级号 */
    private Long newClassTypeId;         /* 新班型id */
    private String newClassTypeName;         /* 新班型名称 */
    private String newTeacherName;         /* 新班级教师名称 */
    private Date updateDate;         /* 修改时间 */
    private Long updater;         /* 修改人 */
    private String url1;         /* 重修凭证url1 */
    private String url2;         /* 重修凭证url2 */
    private String url3;         /* 重修凭证url3 */
    private Long oldTeacherId;
    private Long newTeacherId;
    private String name;
    private String mobile;
    private String qqNo;
    private Long orderId;         /* 原订单id */
    private Integer isMail;         /* 是否邮寄教材 0不需要 1需要 */
    private Long newOrderId;         /* 重修生成的新订单ID */
    private Double newCostPrice;         /* 新课程金额 */
    private Double newBookPrice;         /* 新课程教材费 */
    private Double newOrderPrice;         /* 重修订单应付金额 */
    private String source;         /* 订单来源 */
    private Long oneRmbRebuild;         /* 一元重修[0:否,1:是] */

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassStudentId() {
        return classStudentId;
    }

    public void setClassStudentId(Long classStudentId) {
        this.classStudentId = classStudentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public String getApproveView() {
        return approveView;
    }

    public void setApproveView(String approveView) {
        this.approveView = approveView;
    }

    public Long getApprover() {
        return approver;
    }

    public void setApprover(Long approver) {
        this.approver = approver;
    }

    public Long getOldClassId() {
        return oldClassId;
    }

    public void setOldClassId(Long oldClassId) {
        this.oldClassId = oldClassId;
    }

    public String getOldClassNo() {
        return oldClassNo;
    }

    public void setOldClassNo(String oldClassNo) {
        this.oldClassNo = oldClassNo;
    }

    public Long getOldClassTypeId() {
        return oldClassTypeId;
    }

    public void setOldClassTypeId(Long oldClassTypeId) {
        this.oldClassTypeId = oldClassTypeId;
    }

    public String getOldClassTypeName() {
        return oldClassTypeName;
    }

    public void setOldClassTypeName(String oldClassTypeName) {
        this.oldClassTypeName = oldClassTypeName;
    }

    public String getOldTeacherName() {
        return oldTeacherName;
    }

    public void setOldTeacherName(String oldTeacherName) {
        this.oldTeacherName = oldTeacherName;
    }

    public Long getNewClassId() {
        return newClassId;
    }

    public void setNewClassId(Long newClassId) {
        this.newClassId = newClassId;
    }

    public String getNewClassNo() {
        return newClassNo;
    }

    public void setNewClassNo(String newClassNo) {
        this.newClassNo = newClassNo;
    }

    public Long getNewClassTypeId() {
        return newClassTypeId;
    }

    public void setNewClassTypeId(Long newClassTypeId) {
        this.newClassTypeId = newClassTypeId;
    }

    public String getNewClassTypeName() {
        return newClassTypeName;
    }

    public void setNewClassTypeName(String newClassTypeName) {
        this.newClassTypeName = newClassTypeName;
    }

    public String getNewTeacherName() {
        return newTeacherName;
    }

    public void setNewTeacherName(String newTeacherName) {
        this.newTeacherName = newTeacherName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public Long getOldTeacherId() {
        return oldTeacherId;
    }

    public void setOldTeacherId(Long oldTeacherId) {
        this.oldTeacherId = oldTeacherId;
    }

    public Long getNewTeacherId() {
        return newTeacherId;
    }

    public void setNewTeacherId(Long newTeacherId) {
        this.newTeacherId = newTeacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQqNo() {
        return qqNo;
    }

    public void setQqNo(String qqNo) {
        this.qqNo = qqNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getIsMail() {
        return isMail;
    }

    public void setIsMail(Integer isMail) {
        this.isMail = isMail;
    }

    public Long getNewOrderId() {
        return newOrderId;
    }

    public void setNewOrderId(Long newOrderId) {
        this.newOrderId = newOrderId;
    }

    public Double getNewCostPrice() {
        return newCostPrice;
    }

    public void setNewCostPrice(Double newCostPrice) {
        this.newCostPrice = newCostPrice;
    }

    public Double getNewBookPrice() {
        return newBookPrice;
    }

    public void setNewBookPrice(Double newBookPrice) {
        this.newBookPrice = newBookPrice;
    }

    public Double getNewOrderPrice() {
        return newOrderPrice;
    }

    public void setNewOrderPrice(Double newOrderPrice) {
        this.newOrderPrice = newOrderPrice;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getOneRmbRebuild() {
        return oneRmbRebuild;
    }

    public void setOneRmbRebuild(Long oneRmbRebuild) {
        this.oneRmbRebuild = oneRmbRebuild;
    }
}
