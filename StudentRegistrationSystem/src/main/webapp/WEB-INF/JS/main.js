

window.onload =function ()
{
	
	alert("loaded");
}



var addUser = document.getElementById("updateUserLink");

addUser.onclick = function()
{
		alert("addUser clicked");
		document.getElementById("userForm").setAttribute("commandName", "updateuser");
}


