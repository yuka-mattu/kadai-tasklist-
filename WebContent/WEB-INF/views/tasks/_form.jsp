<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for="content">タスク内容</label><br />
<input type="text" name="content" value="${tasks.content}" />
<br /><br />

<label for="check_col">進捗</label><br />
<input type="text" name="check_col" value="${tasks.check_col}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">登録</button>