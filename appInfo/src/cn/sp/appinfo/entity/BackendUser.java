package cn.sp.appinfo.entity;

import java.sql.Date;

public class BackendUser {

		private Integer id;
		private String userCode;
		private String userName;
		private Integer userType;
		private Integer createdBy;
		private Date creationDate;
		private Integer modifyBy;
		private Date modifyDate;
		private String userPassword;
		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		/**
		 * @return the userCode
		 */
		public String getUserCode() {
			return userCode;
		}
		/**
		 * @param userCode the userCode to set
		 */
		public void setUserCode(String userCode) {
			this.userCode = userCode;
		}
		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}
		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}
		/**
		 * @return the userType
		 */
		public Integer getUserType() {
			return userType;
		}
		/**
		 * @param userType the userType to set
		 */
		public void setUserType(Integer userType) {
			this.userType = userType;
		}
		/**
		 * @return the createdBy
		 */
		public Integer getCreatedBy() {
			return createdBy;
		}
		/**
		 * @param createdBy the createdBy to set
		 */
		public void setCreatedBy(Integer createdBy) {
			this.createdBy = createdBy;
		}
		/**
		 * @return the creationDate
		 */
		public Date getCreationDate() {
			return creationDate;
		}
		/**
		 * @param creationDate the creationDate to set
		 */
		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}
		/**
		 * @return the modifyBy
		 */
		public Integer getModifyBy() {
			return modifyBy;
		}
		/**
		 * @param modifyBy the modifyBy to set
		 */
		public void setModifyBy(Integer modifyBy) {
			this.modifyBy = modifyBy;
		}
		/**
		 * @return the modifyDate
		 */
		public Date getModifyDate() {
			return modifyDate;
		}
		/**
		 * @param modifyDate the modifyDate to set
		 */
		public void setModifyDate(Date modifyDate) {
			this.modifyDate = modifyDate;
		}
		/**
		 * @return the userPassword
		 */
		public String getUserPassword() {
			return userPassword;
		}
		/**
		 * @param userPassword the userPassword to set
		 */
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
	
		public BackendUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		public BackendUser(Integer id, String userCode, String userName, Integer userType, Integer createdBy,
				Date creationDate, Integer modifyBy, Date modifyDate, String userPassword) {
			super();
			this.id = id;
			this.userCode = userCode;
			this.userName = userName;
			this.userType = userType;
			this.createdBy = createdBy;
			this.creationDate = creationDate;
			this.modifyBy = modifyBy;
			this.modifyDate = modifyDate;
			this.userPassword = userPassword;
		}
		
}
