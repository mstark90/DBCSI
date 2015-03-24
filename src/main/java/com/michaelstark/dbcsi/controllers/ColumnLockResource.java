/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michaelstark.dbcsi.controllers;

import com.michaelstark.dbcsi.ColumnLock;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mstark
 */
@RestController
@RequestMapping("/rest/columnlocks")
public class ColumnLockResource {
    
    private JdbcTemplate dataSource;
    private static final Logger logger = Logger.getLogger("ColumnLocker");
    
    public ColumnLockResource() {
        
    }
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = new JdbcTemplate(dataSource);
    }
    
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ColumnLock> getAllLocks() {
        List<ColumnLock> locks = new LinkedList<>();
        
        return locks;
    }
    
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ColumnLock createLock(HttpServletRequest request,
            @RequestParam("schema_name") String schemaName,
            @RequestParam("table_name") String tableName,
            @RequestParam("column_name") String columnName,
            @RequestParam(value = "enabled", defaultValue = "true") boolean enabled){
        ColumnLock lock = new ColumnLock();
        lock.setColumnName(columnName);
        lock.setSchemaName(schemaName);
        lock.setTableName(tableName);
        lock.setIsEnabled(enabled);
        
        return lock;
    }
}
