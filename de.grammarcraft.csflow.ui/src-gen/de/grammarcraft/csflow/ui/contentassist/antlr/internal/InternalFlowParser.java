package de.grammarcraft.csflow.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.grammarcraft.csflow.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'import'", "'flow'", "'>'", "';'", "'in'", "'out'", "'ebc'", "'='", "'method'", "'#'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowParser.tokenNames; }
    public String getGrammarFileName() { return "../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g"; }


     
     	private FlowGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:61:1: ( ruleModel EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:1: ( rule__Model__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:89:1: ( ruleQualifiedName EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:116:1: entryRuleFunctionUnit : ruleFunctionUnit EOF ;
    public final void entryRuleFunctionUnit() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:117:1: ( ruleFunctionUnit EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:118:1: ruleFunctionUnit EOF
            {
             before(grammarAccess.getFunctionUnitRule()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getFunctionUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUnit188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionUnit"


    // $ANTLR start "ruleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:125:1: ruleFunctionUnit : ( ( rule__FunctionUnit__Alternatives ) ) ;
    public final void ruleFunctionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:129:2: ( ( ( rule__FunctionUnit__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:131:1: ( rule__FunctionUnit__Alternatives )
            {
             before(grammarAccess.getFunctionUnitAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:1: ( rule__FunctionUnit__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:2: rule__FunctionUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214);
            rule__FunctionUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionUnit"


    // $ANTLR start "entryRuleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:145:1: ( ruleImport EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:1: ( rule__Import__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:172:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:173:1: ( ruleFlow EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:174:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow301);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:181:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:185:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:187:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:1: ( rule__Flow__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow334);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:200:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:201:1: ( ruleStream EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:202:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream361);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:209:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:213:2: ( ( ( rule__Stream__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:215:1: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:1: ( rule__Stream__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:2: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_rule__Stream__Group__0_in_ruleStream394);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:228:1: entryRuleLeftPort : ruleLeftPort EOF ;
    public final void entryRuleLeftPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:229:1: ( ruleLeftPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:230:1: ruleLeftPort EOF
            {
             before(grammarAccess.getLeftPortRule()); 
            pushFollow(FOLLOW_ruleLeftPort_in_entryRuleLeftPort421);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getLeftPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPort428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftPort"


    // $ANTLR start "ruleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:237:1: ruleLeftPort : ( ( rule__LeftPort__Alternatives ) ) ;
    public final void ruleLeftPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:241:2: ( ( ( rule__LeftPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:243:1: ( rule__LeftPort__Alternatives )
            {
             before(grammarAccess.getLeftPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:1: ( rule__LeftPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:2: rule__LeftPort__Alternatives
            {
            pushFollow(FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454);
            rule__LeftPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLeftPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftPort"


    // $ANTLR start "entryRuleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:256:1: entryRuleGlobalInputPort : ruleGlobalInputPort EOF ;
    public final void entryRuleGlobalInputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:257:1: ( ruleGlobalInputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:258:1: ruleGlobalInputPort EOF
            {
             before(grammarAccess.getGlobalInputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481);
            ruleGlobalInputPort();

            state._fsp--;

             after(grammarAccess.getGlobalInputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInputPort488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalInputPort"


    // $ANTLR start "ruleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:265:1: ruleGlobalInputPort : ( ( rule__GlobalInputPort__Group__0 ) ) ;
    public final void ruleGlobalInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:269:2: ( ( ( rule__GlobalInputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:271:1: ( rule__GlobalInputPort__Group__0 )
            {
             before(grammarAccess.getGlobalInputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:1: ( rule__GlobalInputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:2: rule__GlobalInputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514);
            rule__GlobalInputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalInputPort"


    // $ANTLR start "entryRuleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:284:1: entryRuleUnnamedSubFlowPort : ruleUnnamedSubFlowPort EOF ;
    public final void entryRuleUnnamedSubFlowPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:285:1: ( ruleUnnamedSubFlowPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:286:1: ruleUnnamedSubFlowPort EOF
            {
             before(grammarAccess.getUnnamedSubFlowPortRule()); 
            pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541);
            ruleUnnamedSubFlowPort();

            state._fsp--;

             after(grammarAccess.getUnnamedSubFlowPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnnamedSubFlowPort"


    // $ANTLR start "ruleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:293:1: ruleUnnamedSubFlowPort : ( ( rule__UnnamedSubFlowPort__Group__0 ) ) ;
    public final void ruleUnnamedSubFlowPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:297:2: ( ( ( rule__UnnamedSubFlowPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:299:1: ( rule__UnnamedSubFlowPort__Group__0 )
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:1: ( rule__UnnamedSubFlowPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:2: rule__UnnamedSubFlowPort__Group__0
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574);
            rule__UnnamedSubFlowPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamedSubFlowPort"


    // $ANTLR start "entryRuleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:312:1: entryRuleRightPort : ruleRightPort EOF ;
    public final void entryRuleRightPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:313:1: ( ruleRightPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:314:1: ruleRightPort EOF
            {
             before(grammarAccess.getRightPortRule()); 
            pushFollow(FOLLOW_ruleRightPort_in_entryRuleRightPort601);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getRightPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPort608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightPort"


    // $ANTLR start "ruleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:321:1: ruleRightPort : ( ( rule__RightPort__Alternatives ) ) ;
    public final void ruleRightPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:325:2: ( ( ( rule__RightPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:327:1: ( rule__RightPort__Alternatives )
            {
             before(grammarAccess.getRightPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:1: ( rule__RightPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:2: rule__RightPort__Alternatives
            {
            pushFollow(FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634);
            rule__RightPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightPort"


    // $ANTLR start "entryRuleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:340:1: entryRuleGlobalOutputPort : ruleGlobalOutputPort EOF ;
    public final void entryRuleGlobalOutputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:341:1: ( ruleGlobalOutputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:342:1: ruleGlobalOutputPort EOF
            {
             before(grammarAccess.getGlobalOutputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661);
            ruleGlobalOutputPort();

            state._fsp--;

             after(grammarAccess.getGlobalOutputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalOutputPort668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalOutputPort"


    // $ANTLR start "ruleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:349:1: ruleGlobalOutputPort : ( ( rule__GlobalOutputPort__Group__0 ) ) ;
    public final void ruleGlobalOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:353:2: ( ( ( rule__GlobalOutputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:355:1: ( rule__GlobalOutputPort__Group__0 )
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:1: ( rule__GlobalOutputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:2: rule__GlobalOutputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694);
            rule__GlobalOutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalOutputPort"


    // $ANTLR start "entryRulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:368:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:369:1: ( rulePort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:370:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort721);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:377:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:381:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:383:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:1: ( rule__Port__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort754);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:396:1: entryRuleNamedPort : ruleNamedPort EOF ;
    public final void entryRuleNamedPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:397:1: ( ruleNamedPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:398:1: ruleNamedPort EOF
            {
             before(grammarAccess.getNamedPortRule()); 
            pushFollow(FOLLOW_ruleNamedPort_in_entryRuleNamedPort781);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getNamedPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPort788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedPort"


    // $ANTLR start "ruleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:405:1: ruleNamedPort : ( ( rule__NamedPort__Group__0 ) ) ;
    public final void ruleNamedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:409:2: ( ( ( rule__NamedPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:411:1: ( rule__NamedPort__Group__0 )
            {
             before(grammarAccess.getNamedPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:1: ( rule__NamedPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:2: rule__NamedPort__Group__0
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814);
            rule__NamedPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedPort"


    // $ANTLR start "entryRuleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:424:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:425:1: ( ruleOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:426:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation841);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:433:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:437:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:439:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:1: ( rule__Operation__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation874);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:452:1: entryRuleEbcOperation : ruleEbcOperation EOF ;
    public final void entryRuleEbcOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:453:1: ( ruleEbcOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:454:1: ruleEbcOperation EOF
            {
             before(grammarAccess.getEbcOperationRule()); 
            pushFollow(FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901);
            ruleEbcOperation();

            state._fsp--;

             after(grammarAccess.getEbcOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEbcOperation908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEbcOperation"


    // $ANTLR start "ruleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:461:1: ruleEbcOperation : ( ( rule__EbcOperation__Group__0 ) ) ;
    public final void ruleEbcOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:465:2: ( ( ( rule__EbcOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:467:1: ( rule__EbcOperation__Group__0 )
            {
             before(grammarAccess.getEbcOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:1: ( rule__EbcOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:2: rule__EbcOperation__Group__0
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934);
            rule__EbcOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEbcOperation"


    // $ANTLR start "entryRuleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:480:1: entryRuleNativeClass : ruleNativeClass EOF ;
    public final void entryRuleNativeClass() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:481:1: ( ruleNativeClass EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:482:1: ruleNativeClass EOF
            {
             before(grammarAccess.getNativeClassRule()); 
            pushFollow(FOLLOW_ruleNativeClass_in_entryRuleNativeClass961);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getNativeClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeClass968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:489:1: ruleNativeClass : ( ( rule__NativeClass__ReferenceAssignment ) ) ;
    public final void ruleNativeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:493:2: ( ( ( rule__NativeClass__ReferenceAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:495:1: ( rule__NativeClass__ReferenceAssignment )
            {
             before(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:1: ( rule__NativeClass__ReferenceAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:2: rule__NativeClass__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994);
            rule__NativeClass__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:508:1: entryRuleMethodOperation : ruleMethodOperation EOF ;
    public final void entryRuleMethodOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:509:1: ( ruleMethodOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:510:1: ruleMethodOperation EOF
            {
             before(grammarAccess.getMethodOperationRule()); 
            pushFollow(FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1021);
            ruleMethodOperation();

            state._fsp--;

             after(grammarAccess.getMethodOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodOperation1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodOperation"


    // $ANTLR start "ruleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:517:1: ruleMethodOperation : ( ( rule__MethodOperation__Group__0 ) ) ;
    public final void ruleMethodOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:521:2: ( ( ( rule__MethodOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__MethodOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__MethodOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:523:1: ( rule__MethodOperation__Group__0 )
            {
             before(grammarAccess.getMethodOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:1: ( rule__MethodOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:2: rule__MethodOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1054);
            rule__MethodOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodOperation"


    // $ANTLR start "entryRuleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:536:1: entryRuleNativeMethod : ruleNativeMethod EOF ;
    public final void entryRuleNativeMethod() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:537:1: ( ruleNativeMethod EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:538:1: ruleNativeMethod EOF
            {
             before(grammarAccess.getNativeMethodRule()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1081);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getNativeMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeMethod1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeMethod"


    // $ANTLR start "ruleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:545:1: ruleNativeMethod : ( ( rule__NativeMethod__NameAssignment ) ) ;
    public final void ruleNativeMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:549:2: ( ( ( rule__NativeMethod__NameAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__NativeMethod__NameAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__NativeMethod__NameAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:551:1: ( rule__NativeMethod__NameAssignment )
            {
             before(grammarAccess.getNativeMethodAccess().getNameAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:1: ( rule__NativeMethod__NameAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:2: rule__NativeMethod__NameAssignment
            {
            pushFollow(FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1114);
            rule__NativeMethod__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeMethodAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeMethod"


    // $ANTLR start "rule__FunctionUnit__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:564:1: rule__FunctionUnit__Alternatives : ( ( ruleFlow ) | ( ruleOperation ) );
    public final void rule__FunctionUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:568:1: ( ( ruleFlow ) | ( ruleOperation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==19||LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:569:1: ( ruleFlow )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:569:1: ( ruleFlow )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:570:1: ruleFlow
                    {
                     before(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1150);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:575:6: ( ruleOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:575:6: ( ruleOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:576:1: ruleOperation
                    {
                     before(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1167);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUnit__Alternatives"


    // $ANTLR start "rule__LeftPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:586:1: rule__LeftPort__Alternatives : ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__LeftPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:590:1: ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==15) ) {
                    alt2=2;
                }
                else if ( (LA2_1==17) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:591:1: ( ruleGlobalInputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:591:1: ( ruleGlobalInputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:592:1: ruleGlobalInputPort
                    {
                     before(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1199);
                    ruleGlobalInputPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:597:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:597:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:598:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1216);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:603:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:603:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:604:1: rulePort
                    {
                     before(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__LeftPort__Alternatives1233);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftPort__Alternatives"


    // $ANTLR start "rule__RightPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:614:1: rule__RightPort__Alternatives : ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__RightPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:618:1: ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==16) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:619:1: ( ruleGlobalOutputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:619:1: ( ruleGlobalOutputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:620:1: ruleGlobalOutputPort
                    {
                     before(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1265);
                    ruleGlobalOutputPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:625:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:625:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:626:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1282);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:631:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:631:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:632:1: rulePort
                    {
                     before(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__RightPort__Alternatives1299);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPort__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:642:1: rule__Operation__Alternatives : ( ( ruleEbcOperation ) | ( ruleMethodOperation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:646:1: ( ( ruleEbcOperation ) | ( ruleMethodOperation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:647:1: ( ruleEbcOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:647:1: ( ruleEbcOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:648:1: ruleEbcOperation
                    {
                     before(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1331);
                    ruleEbcOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:653:6: ( ruleMethodOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:653:6: ( ruleMethodOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:654:1: ruleMethodOperation
                    {
                     before(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1348);
                    ruleMethodOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:666:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:670:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:671:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01378);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01381);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:678:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:682:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:683:1: ( ( rule__Model__Group_0__0 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:683:1: ( ( rule__Model__Group_0__0 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:684:1: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:685:1: ( rule__Model__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:685:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl1408);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:695:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:699:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:700:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11439);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11442);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:707:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:711:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:712:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:712:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:713:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:714:1: ( rule__Model__ImportsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:714:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl1469);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:724:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:728:1: ( rule__Model__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:729:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21500);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:735:1: rule__Model__Group__2__Impl : ( ( rule__Model__FunctionUnitsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:739:1: ( ( ( rule__Model__FunctionUnitsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:740:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:740:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:741:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:742:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14||LA7_0==19||LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:742:2: rule__Model__FunctionUnitsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl1527);
            	    rule__Model__FunctionUnitsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:758:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:762:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:763:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01564);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01567);
            rule__Model__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:770:1: rule__Model__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:774:1: ( ( 'package' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:775:1: ( 'package' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:775:1: ( 'package' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:776:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group_0__0__Impl1595); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:789:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:793:1: ( rule__Model__Group_0__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:794:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11626);
            rule__Model__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:800:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:804:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:805:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:805:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:806:1: ( rule__Model__NameAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:807:1: ( rule__Model__NameAssignment_0_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:807:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1653);
            rule__Model__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:821:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:825:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:826:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01687);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01690);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:833:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:837:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:838:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:838:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:839:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1717); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:850:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:854:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:855:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11746);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:861:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:865:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:866:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:866:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:867:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:868:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:868:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1773);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:882:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:886:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:887:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01808);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01811);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:894:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:898:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:899:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:899:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:900:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl1839); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:913:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:917:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:918:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11870);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:924:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:928:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:929:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:929:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:930:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1897); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:945:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:949:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:950:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01930);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01933);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:957:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:961:1: ( ( 'import' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:962:1: ( 'import' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:962:1: ( 'import' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:963:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0__Impl1961); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:976:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:980:1: ( rule__Import__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:981:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11992);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:987:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:991:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:992:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:992:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:993:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:994:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:994:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2019);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1008:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1012:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1013:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02053);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02056);
            rule__Flow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1020:1: rule__Flow__Group__0__Impl : ( 'flow' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1024:1: ( ( 'flow' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1025:1: ( 'flow' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1025:1: ( 'flow' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1026:1: 'flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Flow__Group__0__Impl2084); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1039:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1043:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1044:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12115);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12118);
            rule__Flow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1051:1: rule__Flow__Group__1__Impl : ( ( rule__Flow__NameAssignment_1 ) ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1055:1: ( ( ( rule__Flow__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1056:1: ( ( rule__Flow__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1056:1: ( ( rule__Flow__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1057:1: ( rule__Flow__NameAssignment_1 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1058:1: ( rule__Flow__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1058:2: rule__Flow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2145);
            rule__Flow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1068:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1072:1: ( rule__Flow__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1073:2: rule__Flow__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22175);
            rule__Flow__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1079:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__StreamsAssignment_2 )* ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1083:1: ( ( ( rule__Flow__StreamsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1084:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1084:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1085:1: ( rule__Flow__StreamsAssignment_2 )*
            {
             before(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1086:1: ( rule__Flow__StreamsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1086:2: rule__Flow__StreamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2202);
            	    rule__Flow__StreamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1102:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1106:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1107:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02239);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02242);
            rule__Stream__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1114:1: rule__Stream__Group__0__Impl : ( ( rule__Stream__LeftPortAssignment_0 ) ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1118:1: ( ( ( rule__Stream__LeftPortAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1119:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1119:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1120:1: ( rule__Stream__LeftPortAssignment_0 )
            {
             before(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1121:1: ( rule__Stream__LeftPortAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1121:2: rule__Stream__LeftPortAssignment_0
            {
            pushFollow(FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2269);
            rule__Stream__LeftPortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1131:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1135:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1136:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12299);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12302);
            rule__Stream__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1143:1: rule__Stream__Group__1__Impl : ( '>' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1147:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1148:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1148:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1149:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Stream__Group__1__Impl2330); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1162:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1166:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1167:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22361);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22364);
            rule__Stream__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1174:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__MessageAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1178:1: ( ( ( rule__Stream__MessageAssignment_2 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1179:1: ( ( rule__Stream__MessageAssignment_2 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1179:1: ( ( rule__Stream__MessageAssignment_2 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1180:1: ( rule__Stream__MessageAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getMessageAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1181:1: ( rule__Stream__MessageAssignment_2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1181:2: rule__Stream__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2391);
            rule__Stream__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1191:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1195:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1196:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
            {
            pushFollow(FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__32421);
            rule__Stream__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__32424);
            rule__Stream__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1203:1: rule__Stream__Group__3__Impl : ( '>' ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1207:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1208:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1208:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1209:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Stream__Group__3__Impl2452); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1222:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl rule__Stream__Group__5 ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1226:1: ( rule__Stream__Group__4__Impl rule__Stream__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1227:2: rule__Stream__Group__4__Impl rule__Stream__Group__5
            {
            pushFollow(FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__42483);
            rule__Stream__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__42486);
            rule__Stream__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4"


    // $ANTLR start "rule__Stream__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1234:1: rule__Stream__Group__4__Impl : ( ( rule__Stream__RightPortAssignment_4 ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1238:1: ( ( ( rule__Stream__RightPortAssignment_4 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1239:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1239:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1240:1: ( rule__Stream__RightPortAssignment_4 )
            {
             before(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1241:1: ( rule__Stream__RightPortAssignment_4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1241:2: rule__Stream__RightPortAssignment_4
            {
            pushFollow(FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl2513);
            rule__Stream__RightPortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4__Impl"


    // $ANTLR start "rule__Stream__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1251:1: rule__Stream__Group__5 : rule__Stream__Group__5__Impl ;
    public final void rule__Stream__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1255:1: ( rule__Stream__Group__5__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1256:2: rule__Stream__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__52543);
            rule__Stream__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5"


    // $ANTLR start "rule__Stream__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1262:1: rule__Stream__Group__5__Impl : ( ';' ) ;
    public final void rule__Stream__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1266:1: ( ( ';' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1267:1: ( ';' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1267:1: ( ';' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1268:1: ';'
            {
             before(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Stream__Group__5__Impl2571); 
             after(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1293:1: rule__GlobalInputPort__Group__0 : rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 ;
    public final void rule__GlobalInputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1297:1: ( rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1298:2: rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__02614);
            rule__GlobalInputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__02617);
            rule__GlobalInputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0"


    // $ANTLR start "rule__GlobalInputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1305:1: rule__GlobalInputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalInputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1309:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1310:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1310:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1311:1: '.'
            {
             before(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__GlobalInputPort__Group__0__Impl2645); 
             after(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1324:1: rule__GlobalInputPort__Group__1 : rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 ;
    public final void rule__GlobalInputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1328:1: ( rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1329:2: rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__12676);
            rule__GlobalInputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__12679);
            rule__GlobalInputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1"


    // $ANTLR start "rule__GlobalInputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1336:1: rule__GlobalInputPort__Group__1__Impl : ( 'in' ) ;
    public final void rule__GlobalInputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1340:1: ( ( 'in' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1341:1: ( 'in' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1341:1: ( 'in' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1342:1: 'in'
            {
             before(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__GlobalInputPort__Group__1__Impl2707); 
             after(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1355:1: rule__GlobalInputPort__Group__2 : rule__GlobalInputPort__Group__2__Impl ;
    public final void rule__GlobalInputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1359:1: ( rule__GlobalInputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1360:2: rule__GlobalInputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__22738);
            rule__GlobalInputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2"


    // $ANTLR start "rule__GlobalInputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1366:1: rule__GlobalInputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalInputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1370:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1371:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1371:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1372:1: ()
            {
             before(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1373:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1375:1: 
            {
            }

             after(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1391:1: rule__UnnamedSubFlowPort__Group__0 : rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 ;
    public final void rule__UnnamedSubFlowPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1395:1: ( rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1396:2: rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__02802);
            rule__UnnamedSubFlowPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__02805);
            rule__UnnamedSubFlowPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1403:1: rule__UnnamedSubFlowPort__Group__0__Impl : ( '.' ) ;
    public final void rule__UnnamedSubFlowPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1407:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1408:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1408:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1409:1: '.'
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__UnnamedSubFlowPort__Group__0__Impl2833); 
             after(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1422:1: rule__UnnamedSubFlowPort__Group__1 : rule__UnnamedSubFlowPort__Group__1__Impl ;
    public final void rule__UnnamedSubFlowPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1426:1: ( rule__UnnamedSubFlowPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1427:2: rule__UnnamedSubFlowPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__12864);
            rule__UnnamedSubFlowPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1433:1: rule__UnnamedSubFlowPort__Group__1__Impl : ( () ) ;
    public final void rule__UnnamedSubFlowPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1437:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1438:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1438:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1439:1: ()
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1440:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1442:1: 
            {
            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1456:1: rule__GlobalOutputPort__Group__0 : rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 ;
    public final void rule__GlobalOutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1460:1: ( rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1461:2: rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__02926);
            rule__GlobalOutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__02929);
            rule__GlobalOutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0"


    // $ANTLR start "rule__GlobalOutputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1468:1: rule__GlobalOutputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalOutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1472:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1473:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1473:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1474:1: '.'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__GlobalOutputPort__Group__0__Impl2957); 
             after(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1487:1: rule__GlobalOutputPort__Group__1 : rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 ;
    public final void rule__GlobalOutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1491:1: ( rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1492:2: rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__12988);
            rule__GlobalOutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__12991);
            rule__GlobalOutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1"


    // $ANTLR start "rule__GlobalOutputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1499:1: rule__GlobalOutputPort__Group__1__Impl : ( 'out' ) ;
    public final void rule__GlobalOutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1503:1: ( ( 'out' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1504:1: ( 'out' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1504:1: ( 'out' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1505:1: 'out'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__GlobalOutputPort__Group__1__Impl3019); 
             after(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1518:1: rule__GlobalOutputPort__Group__2 : rule__GlobalOutputPort__Group__2__Impl ;
    public final void rule__GlobalOutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1522:1: ( rule__GlobalOutputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1523:2: rule__GlobalOutputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23050);
            rule__GlobalOutputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2"


    // $ANTLR start "rule__GlobalOutputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1529:1: rule__GlobalOutputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalOutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1533:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1534:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1534:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1535:1: ()
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1536:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1538:1: 
            {
            }

             after(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1554:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1558:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1559:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03114);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03117);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1566:1: rule__Port__Group__0__Impl : ( ( rule__Port__FunctionUnitAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1570:1: ( ( ( rule__Port__FunctionUnitAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1571:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1571:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1572:1: ( rule__Port__FunctionUnitAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1573:1: ( rule__Port__FunctionUnitAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1573:2: rule__Port__FunctionUnitAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3144);
            rule__Port__FunctionUnitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1583:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1587:1: ( rule__Port__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1588:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13174);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1594:1: rule__Port__Group__1__Impl : ( ( rule__Port__PortAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1598:1: ( ( ( rule__Port__PortAssignment_1 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1599:1: ( ( rule__Port__PortAssignment_1 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1599:1: ( ( rule__Port__PortAssignment_1 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1600:1: ( rule__Port__PortAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getPortAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1601:1: ( rule__Port__PortAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1601:2: rule__Port__PortAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3201);
                    rule__Port__PortAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__NamedPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1615:1: rule__NamedPort__Group__0 : rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 ;
    public final void rule__NamedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1619:1: ( rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1620:2: rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03236);
            rule__NamedPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03239);
            rule__NamedPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0"


    // $ANTLR start "rule__NamedPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1627:1: rule__NamedPort__Group__0__Impl : ( '.' ) ;
    public final void rule__NamedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1631:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1632:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1632:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1633:1: '.'
            {
             before(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__NamedPort__Group__0__Impl3267); 
             after(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0__Impl"


    // $ANTLR start "rule__NamedPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1646:1: rule__NamedPort__Group__1 : rule__NamedPort__Group__1__Impl ;
    public final void rule__NamedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1650:1: ( rule__NamedPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1651:2: rule__NamedPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13298);
            rule__NamedPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1"


    // $ANTLR start "rule__NamedPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1657:1: rule__NamedPort__Group__1__Impl : ( ( rule__NamedPort__NameAssignment_1 ) ) ;
    public final void rule__NamedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1661:1: ( ( ( rule__NamedPort__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1662:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1662:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1663:1: ( rule__NamedPort__NameAssignment_1 )
            {
             before(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1664:1: ( rule__NamedPort__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1664:2: rule__NamedPort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3325);
            rule__NamedPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1678:1: rule__EbcOperation__Group__0 : rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 ;
    public final void rule__EbcOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1682:1: ( rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1683:2: rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03359);
            rule__EbcOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03362);
            rule__EbcOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0"


    // $ANTLR start "rule__EbcOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1690:1: rule__EbcOperation__Group__0__Impl : ( 'ebc' ) ;
    public final void rule__EbcOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1694:1: ( ( 'ebc' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1695:1: ( 'ebc' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1695:1: ( 'ebc' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1696:1: 'ebc'
            {
             before(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__EbcOperation__Group__0__Impl3390); 
             after(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0__Impl"


    // $ANTLR start "rule__EbcOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1709:1: rule__EbcOperation__Group__1 : rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 ;
    public final void rule__EbcOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1713:1: ( rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1714:2: rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__13421);
            rule__EbcOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__13424);
            rule__EbcOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1"


    // $ANTLR start "rule__EbcOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1721:1: rule__EbcOperation__Group__1__Impl : ( ( rule__EbcOperation__NameAssignment_1 ) ) ;
    public final void rule__EbcOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1725:1: ( ( ( rule__EbcOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1726:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1726:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1727:1: ( rule__EbcOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1728:1: ( rule__EbcOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1728:2: rule__EbcOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl3451);
            rule__EbcOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1738:1: rule__EbcOperation__Group__2 : rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 ;
    public final void rule__EbcOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1742:1: ( rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1743:2: rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__23481);
            rule__EbcOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__23484);
            rule__EbcOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2"


    // $ANTLR start "rule__EbcOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1750:1: rule__EbcOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__EbcOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1754:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1755:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1755:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1756:1: '='
            {
             before(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__EbcOperation__Group__2__Impl3512); 
             after(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2__Impl"


    // $ANTLR start "rule__EbcOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1769:1: rule__EbcOperation__Group__3 : rule__EbcOperation__Group__3__Impl ;
    public final void rule__EbcOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1773:1: ( rule__EbcOperation__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1774:2: rule__EbcOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__33543);
            rule__EbcOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3"


    // $ANTLR start "rule__EbcOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1780:1: rule__EbcOperation__Group__3__Impl : ( ( rule__EbcOperation__ClassAssignment_3 ) ) ;
    public final void rule__EbcOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1784:1: ( ( ( rule__EbcOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1785:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1785:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1786:1: ( rule__EbcOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1787:1: ( rule__EbcOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1787:2: rule__EbcOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl3570);
            rule__EbcOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1805:1: rule__MethodOperation__Group__0 : rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 ;
    public final void rule__MethodOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1809:1: ( rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1810:2: rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__03608);
            rule__MethodOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__03611);
            rule__MethodOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0"


    // $ANTLR start "rule__MethodOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1817:1: rule__MethodOperation__Group__0__Impl : ( 'method' ) ;
    public final void rule__MethodOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1821:1: ( ( 'method' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1822:1: ( 'method' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1822:1: ( 'method' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1823:1: 'method'
            {
             before(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__MethodOperation__Group__0__Impl3639); 
             after(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0__Impl"


    // $ANTLR start "rule__MethodOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1836:1: rule__MethodOperation__Group__1 : rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 ;
    public final void rule__MethodOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1840:1: ( rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1841:2: rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__13670);
            rule__MethodOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__13673);
            rule__MethodOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1"


    // $ANTLR start "rule__MethodOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1848:1: rule__MethodOperation__Group__1__Impl : ( ( rule__MethodOperation__NameAssignment_1 ) ) ;
    public final void rule__MethodOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1852:1: ( ( ( rule__MethodOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1853:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1853:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1854:1: ( rule__MethodOperation__NameAssignment_1 )
            {
             before(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1855:1: ( rule__MethodOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1855:2: rule__MethodOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl3700);
            rule__MethodOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1__Impl"


    // $ANTLR start "rule__MethodOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1865:1: rule__MethodOperation__Group__2 : rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 ;
    public final void rule__MethodOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1869:1: ( rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1870:2: rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__23730);
            rule__MethodOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__23733);
            rule__MethodOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2"


    // $ANTLR start "rule__MethodOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1877:1: rule__MethodOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__MethodOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1881:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1882:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1882:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1883:1: '='
            {
             before(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__MethodOperation__Group__2__Impl3761); 
             after(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2__Impl"


    // $ANTLR start "rule__MethodOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1896:1: rule__MethodOperation__Group__3 : rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 ;
    public final void rule__MethodOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1900:1: ( rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1901:2: rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__33792);
            rule__MethodOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__33795);
            rule__MethodOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3"


    // $ANTLR start "rule__MethodOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1908:1: rule__MethodOperation__Group__3__Impl : ( ( rule__MethodOperation__ClassAssignment_3 ) ) ;
    public final void rule__MethodOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1912:1: ( ( ( rule__MethodOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1913:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1913:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1914:1: ( rule__MethodOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1915:1: ( rule__MethodOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1915:2: rule__MethodOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl3822);
            rule__MethodOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1925:1: rule__MethodOperation__Group__4 : rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 ;
    public final void rule__MethodOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1929:1: ( rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1930:2: rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__43852);
            rule__MethodOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__43855);
            rule__MethodOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4"


    // $ANTLR start "rule__MethodOperation__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1937:1: rule__MethodOperation__Group__4__Impl : ( '#' ) ;
    public final void rule__MethodOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1941:1: ( ( '#' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1942:1: ( '#' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1942:1: ( '#' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1943:1: '#'
            {
             before(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__MethodOperation__Group__4__Impl3883); 
             after(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4__Impl"


    // $ANTLR start "rule__MethodOperation__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1956:1: rule__MethodOperation__Group__5 : rule__MethodOperation__Group__5__Impl ;
    public final void rule__MethodOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1960:1: ( rule__MethodOperation__Group__5__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1961:2: rule__MethodOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__53914);
            rule__MethodOperation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5"


    // $ANTLR start "rule__MethodOperation__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1967:1: rule__MethodOperation__Group__5__Impl : ( ( rule__MethodOperation__MethodAssignment_5 ) ) ;
    public final void rule__MethodOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1971:1: ( ( ( rule__MethodOperation__MethodAssignment_5 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1972:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1972:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1973:1: ( rule__MethodOperation__MethodAssignment_5 )
            {
             before(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1974:1: ( rule__MethodOperation__MethodAssignment_5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1974:2: rule__MethodOperation__MethodAssignment_5
            {
            pushFollow(FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl3941);
            rule__MethodOperation__MethodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5__Impl"


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1997:1: rule__Model__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2001:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2002:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2002:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2003:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_13988);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_1"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2012:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2016:1: ( ( ruleImport ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2017:1: ( ruleImport )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2017:1: ( ruleImport )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2018:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_14019);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__FunctionUnitsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2027:1: rule__Model__FunctionUnitsAssignment_2 : ( ruleFunctionUnit ) ;
    public final void rule__Model__FunctionUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2031:1: ( ( ruleFunctionUnit ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2032:1: ( ruleFunctionUnit )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2032:1: ( ruleFunctionUnit )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2033:1: ruleFunctionUnit
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_24050);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionUnitsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2042:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2046:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2047:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2047:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2048:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_14081);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Flow__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2057:1: rule__Flow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2061:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2062:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2062:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2063:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_14112); 
             after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__NameAssignment_1"


    // $ANTLR start "rule__Flow__StreamsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2072:1: rule__Flow__StreamsAssignment_2 : ( ruleStream ) ;
    public final void rule__Flow__StreamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2076:1: ( ( ruleStream ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2077:1: ( ruleStream )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2077:1: ( ruleStream )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2078:1: ruleStream
            {
             before(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_24143);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StreamsAssignment_2"


    // $ANTLR start "rule__Stream__LeftPortAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2087:1: rule__Stream__LeftPortAssignment_0 : ( ruleLeftPort ) ;
    public final void rule__Stream__LeftPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2091:1: ( ( ruleLeftPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2092:1: ( ruleLeftPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2092:1: ( ruleLeftPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2093:1: ruleLeftPort
            {
             before(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_04174);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__LeftPortAssignment_0"


    // $ANTLR start "rule__Stream__MessageAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2102:1: rule__Stream__MessageAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Stream__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2106:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2107:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2107:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2108:1: ruleQualifiedName
            {
             before(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_24205);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__MessageAssignment_2"


    // $ANTLR start "rule__Stream__RightPortAssignment_4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2117:1: rule__Stream__RightPortAssignment_4 : ( ruleRightPort ) ;
    public final void rule__Stream__RightPortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2121:1: ( ( ruleRightPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2122:1: ( ruleRightPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2122:1: ( ruleRightPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2123:1: ruleRightPort
            {
             before(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_44236);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__RightPortAssignment_4"


    // $ANTLR start "rule__Port__FunctionUnitAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2132:1: rule__Port__FunctionUnitAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__FunctionUnitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2136:1: ( ( ( RULE_ID ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2137:1: ( ( RULE_ID ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2137:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2138:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2139:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2140:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_04271); 
             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__FunctionUnitAssignment_0"


    // $ANTLR start "rule__Port__PortAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2151:1: rule__Port__PortAssignment_1 : ( ruleNamedPort ) ;
    public final void rule__Port__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2155:1: ( ( ruleNamedPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2156:1: ( ruleNamedPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2156:1: ( ruleNamedPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2157:1: ruleNamedPort
            {
             before(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_14306);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__PortAssignment_1"


    // $ANTLR start "rule__NamedPort__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2166:1: rule__NamedPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2170:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2171:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2171:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2172:1: RULE_ID
            {
             before(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_14337); 
             after(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2181:1: rule__EbcOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EbcOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2185:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2186:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2186:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2187:1: RULE_ID
            {
             before(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_14368); 
             after(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2196:1: rule__EbcOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__EbcOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2200:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2201:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2201:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2202:1: ruleNativeClass
            {
             before(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_34399);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__ClassAssignment_3"


    // $ANTLR start "rule__NativeClass__ReferenceAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2211:1: rule__NativeClass__ReferenceAssignment : ( ruleQualifiedName ) ;
    public final void rule__NativeClass__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2215:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2216:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2216:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2217:1: ruleQualifiedName
            {
             before(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment4430);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeClass__ReferenceAssignment"


    // $ANTLR start "rule__MethodOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2226:1: rule__MethodOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2230:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2231:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2231:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2232:1: RULE_ID
            {
             before(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_14461); 
             after(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__NameAssignment_1"


    // $ANTLR start "rule__MethodOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2241:1: rule__MethodOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__MethodOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2245:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2246:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2246:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2247:1: ruleNativeClass
            {
             before(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_34492);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__ClassAssignment_3"


    // $ANTLR start "rule__MethodOperation__MethodAssignment_5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2256:1: rule__MethodOperation__MethodAssignment_5 : ( ruleNativeMethod ) ;
    public final void rule__MethodOperation__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2260:1: ( ( ruleNativeMethod ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2261:1: ( ruleNativeMethod )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2261:1: ( ruleNativeMethod )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2262:1: ruleNativeMethod
            {
             before(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_54523);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__MethodAssignment_5"


    // $ANTLR start "rule__NativeMethod__NameAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2271:1: rule__NativeMethod__NameAssignment : ( RULE_ID ) ;
    public final void rule__NativeMethod__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2275:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2276:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2276:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2277:1: RULE_ID
            {
             before(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment4554); 
             after(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeMethod__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUnit188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__0_in_ruleStream394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_entryRuleLeftPort421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPort428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInputPort488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_entryRuleRightPort601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPort608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalOutputPort668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_entryRuleNamedPort781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPort788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEbcOperation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_entryRuleNativeClass961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeClass968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodOperation1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeMethod1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__LeftPort__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__RightPort__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01378 = new BitSet(new long[]{0x0000000000286000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11439 = new BitSet(new long[]{0x0000000000286000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl1469 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl1527 = new BitSet(new long[]{0x0000000000284002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group_0__0__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01687 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1773 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Flow__Group__0__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12115 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2202 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02239 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Stream__Group__1__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__32421 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__32424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Stream__Group__3__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__42483 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__42486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__52543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Stream__Group__5__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__02614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GlobalInputPort__Group__0__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__12676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GlobalInputPort__Group__1__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__22738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__02802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__02805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UnnamedSubFlowPort__Group__0__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__12864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__02926 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__02929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GlobalOutputPort__Group__0__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__12988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GlobalOutputPort__Group__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03114 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NamedPort__Group__0__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EbcOperation__Group__0__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__13421 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__13424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__23481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EbcOperation__Group__2__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__33543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__03608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MethodOperation__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__13670 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__23730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MethodOperation__Group__2__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__33792 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__33795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__43852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__43855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MethodOperation__Group__4__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__53914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_13988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_14019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_24050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_14081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_24143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_04174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_24205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_44236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_04271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_14306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_14368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_34399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_34492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_54523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment4554 = new BitSet(new long[]{0x0000000000000002L});

}