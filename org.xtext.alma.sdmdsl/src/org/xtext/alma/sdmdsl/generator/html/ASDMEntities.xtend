package org.xtext.alma.sdmdsl.generator.html

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class ASDMEntities {
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDMEntities.html
		sdmFsa.setFile("doc/ASDMEntities.html")
		sdmFsa.generateFile(generateASDMEntities)
		
		// creating and generating file ASDMEntities_Menu.html
		sdmFsa.setFile("doc/ASDMEntities_Menu.html")
		sdmFsa.generateFile(generateASDMEntitiesMenu)
		
		// creating and generating file ASDMEntities_Content.html
		sdmFsa.setFile("doc/ASDMEntities_Content.html")
		sdmFsa.generateFile(generateASDMEntitiesContent)
	}
	
	
	def generateASDMEntities()'''
		<HTML>
		<FRAMESET COLS="250,*" NOBORDER>
			<FRAME SRC="ASDMEntities_Menu.html"    NAME="Menu"    NORESIZE NOBORDER>
			<FRAME SRC="ASDMEntities_Content.html" NAME="Content" NORESIZE NOBORDER>	
		</FRAMESET>
		</HTML>
		
	'''
	
	
	
	def generateASDMEntitiesMenu()'''
		<HTML>
		<BODY>
		<H2>ASDM Entities</H2>
		<H2>Static entities (not depending on time)</H2>
		<H3>Static entities with no identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.staticNoIdList»
		«ENDFOR»
		<H3>Static entities with identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.staticWithIdList»
		«ENDFOR»
		<H2>Temporal entities</H2>
		<H3>Temporal entities with no identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.temporalNoIdList»
		«ENDFOR»
		<H3>Temporal entities with identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.temporalWithIdList»
		«ENDFOR»
		</BODY>
		</HTML>
	'''
	
	
	
	def generateASDMEntitiesContent()'''
		<HTML>
		<BODY>
		<H1>ASDM Entities</H1>
		<H2>Static entities (not depending on time)</H2>
		<H3>Static entities with no identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.staticNoId»
		«ENDFOR»
		<H3>Static entities with identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.staticWithId»
		«ENDFOR»
		<H2>Temporal entities</H2>
		<H3>Temporal entities with no identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.temporalNoId»
		«ENDFOR»
		<H3>Temporal entities with identifier</H3>
		«FOR table : container.sortedAlmaTable»
			«table.temporalWithId»
		«ENDFOR»
		</BODY>
		</HTML>
	'''
	
	
	def  staticNoIdList(AlmaTable table)'''
		«IF !table.isTemporal && table.NoAutoIncrementableAttribute»
			<A HREF="ASDMEntities_Content.html#«table.name»" TARGET="Content">«table.name»</A><BR/>		
		«ENDIF»
	'''
	
	def staticNoId(AlmaTable table)'''
		«IF !table.isTemporal && table.NoAutoIncrementableAttribute»
			«table.WithNoId»
		«ENDIF»
	'''
	
	
	def staticWithIdList(AlmaTable table)'''
		«IF !table.isTemporal && !table.NoAutoIncrementableAttribute»
			<A HREF="ASDMEntities_Content.html#«table.name»" TARGET="Content">«table.name»</A><BR/>
		«ENDIF»
	'''
	
	
	def staticWithId(AlmaTable table)'''
		«IF !table.isTemporal && !table.NoAutoIncrementableAttribute»
			«table.WithId»
		«ENDIF»
	'''
	
	
	def temporalNoIdList(AlmaTable table)'''
		«IF table.isTemporal && table.NoAutoIncrementableAttribute»
			<A HREF="ASDMEntities_Content.html#«table.name»" TARGET="Content">«table.name»</A><BR/>
		«ENDIF»
	'''
	
	def temporalNoId(AlmaTable table)'''
		«IF table.isTemporal && table.NoAutoIncrementableAttribute»
			«table.WithNoId»
		«ENDIF»
	'''
	
	
	def temporalWithIdList(AlmaTable table)'''
		«IF table.isTemporal && !table.NoAutoIncrementableAttribute»
			<A HREF="ASDMEntities_Content.html#«table.name»" TARGET="Content">«table.name»</A><BR/>
		«ENDIF»
	'''
	
	
	def temporalWithId(AlmaTable table)'''
		«IF table.isTemporal && !table.NoAutoIncrementableAttribute»
			«table.WithId»
		«ENDIF»
	'''
	
	def WithNoId(AlmaTable table)'''
		<HR/>
		<H4><A NAME="«table.name»">«table.name»</A></H4>
		<B>Key :</B><BR/>
		<UL>
			<LI>
				<TABLE BORDER="1" WIDTH="750">
					<TR>
						<TH WIDTH="250"> Name </TH> <TH WIDTH="250"> Java type </TH><TH WIDTH="250"> C++ type </TH>
					</TR>
		«FOR attr : table.keyAttributes»
					<TR>
						<TD><CODE>«attr.name»</CODE></TD>
						<TD>«attr.JavaType»</TD>
						<TD>«attr.CppType»</TD>
					</TR>
		«ENDFOR»			
				</TABLE>
				<BR/>
			</LI>
		</UL>	
		«table.ValuePart»
	'''
	
	def WithId(AlmaTable table)'''
		<HR/>
		<H4><A NAME="«table.name»">«table.name»</A></H4>
		<B>Key :</B><BR/>
		<UL>
			<LI>
				<TABLE BORDER="1" WIDTH="750">
					<TR>
						<TH WIDTH="250"> Name </TH> <TH WIDTH="250"> Java type </TH><TH WIDTH="250"> C++ type </TH>
					</TR>
		«FOR attr : table.keyAttributes»
					<TR>
			«IF attr.name == table.TheAutoIncrementableAttribute.name»
						<TD><U><CODE>«attr.name»</CODE></U></TD>
			«ELSE»
						<TD><CODE>«attr.name»</CODE></TD>
			«ENDIF»
						<TD>«attr.JavaType»</TD>
						<TD>«attr.CppType»</TD>
					</TR>
		«ENDFOR»			
				</TABLE>
				<BR/>
			</LI>
		</UL>
		«table.ValuePart»
	'''
	
	
	def ValuePart(AlmaTable table)'''
		<B>Value : </B><BR/>
		<UL> 
			<LI><B>Required : </B><BR>
			<TABLE BORDER="1" WIDTH="750">
				<TR>
					<TH WIDTH="250"> Name </TH> <TH WIDTH="250"> Java type </TH><TH WIDTH="250"> C++ type </TH>
				</TR>
		«FOR attr : table.requiredValueAttributes»
				<TR>
				<TD><CODE>«attr.name»</CODE></TD>
				<TD>«attr.JavaType»
					«IF attr.isArray». Dimensions: «attr.JavaTypeDescription»«ENDIF»</TD>
				<TD> «attr.CppType»
					«IF attr.isArray». Dimensions: «attr.CppTypeDescription»«ENDIF»</TD>
				</TR>
		«ENDFOR»			
			</TABLE>
			<BR/>
			</LI>
		«IF table.optionalValueAttributes.size != 0»
			<LI><B>Optional : </B><BR>
			<TABLE BORDER WIDTH="750">
				<TR>
					<TH WIDTH="250"> Name </TH> <TH WIDTH="250"> Java type </TH><TH WIDTH="250"> C++ type </TH>
				</TR>
		«FOR attr : table.optionalValueAttributes»
				<TR>
				<TD><CODE>«attr.name»</CODE></TD>
				<TD>«attr.JavaType»
					«IF attr.isArray». Dimensions: «attr.JavaTypeDescription»«ENDIF»</TD>
				<TD> «attr.CppType»
					«IF attr.isArray». Dimensions: «attr.CppTypeDescription»«ENDIF»</TD>
				</TR>
		«ENDFOR»			
			</TABLE>
			<BR/>
			</LI>
		«ENDIF»
		</UL>
	'''
	
}