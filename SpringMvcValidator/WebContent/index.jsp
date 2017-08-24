<%@taglib uri="http://www.springframework.org/tags/form" prefix="html" %>

<html:form commandName="form">
<pre>
<html:errors/>
name:<html:input path="name"/>
email:<html:input path="email"/>
<input type="submit" value="submit"/>
</pre>
</html:form>