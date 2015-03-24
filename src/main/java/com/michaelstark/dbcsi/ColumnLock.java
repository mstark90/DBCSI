/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michaelstark.dbcsi;

/**
 *
 * @author mstark
 */
public class ColumnLock {
    private long columnLockId;
    private User user;
    private String schemaName, tableName, columnName;
    private boolean isEnabled;

    /**
     * @return the columnLockId
     */
    public long getColumnLockId() {
        return columnLockId;
    }

    /**
     * @param columnLockId the columnLockId to set
     */
    public void setColumnLockId(long columnLockId) {
        this.columnLockId = columnLockId;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName the schemaName to set
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return the tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName the tableName to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the columnName
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName the columnName to set
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return the isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * @param isEnabled the isEnabled to set
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
}
