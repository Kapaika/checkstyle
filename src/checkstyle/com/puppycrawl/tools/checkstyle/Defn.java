////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2002  Oliver Burn
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle;

/**
 * Contains definitions common to the package.
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 **/
public interface Defn
{
    /** property name for the todo pattern **/
    String TODO_PATTERN_PROP = "checkstyle.pattern.todo";
    /** property name for the parameter pattern **/
    String PARAMETER_PATTERN_PROP = "checkstyle.pattern.parameter";
    /** property name for the static variable pattern **/
    String STATIC_PATTERN_PROP = "checkstyle.pattern.static";
    /** property name for the static final variable pattern **/
    String CONST_PATTERN_PROP = "checkstyle.pattern.const";
    /** property name for the member variable pattern **/
    String MEMBER_PATTERN_PROP = "checkstyle.pattern.member";
    /** property name for the public member variable pattern **/
    String PUBLIC_MEMBER_PATTERN_PROP = "checkstyle.pattern.publicmember";
    /** property name for the type pattern **/
    String TYPE_PATTERN_PROP = "checkstyle.pattern.type";
    /** property name for the method local variable pattern **/
    String LOCAL_VAR_PATTERN_PROP = "checkstyle.pattern.localvar";
    /** property name for the method local variable pattern **/
    String METHOD_PATTERN_PROP = "checkstyle.pattern.method";
    /** property name for the maximum line length **/
    String MAX_LINE_LENGTH_PROP = "checkstyle.maxlinelen";
    /** property name for length of methods **/
    String MAX_METHOD_LENGTH_PROP = "checkstyle.maxmethodlen";
    /** property name for length of constructors **/
    String MAX_CONSTRUCTOR_LENGTH_PROP = "checkstyle.maxconstructorlen";
    /** property name for length of files **/
    String MAX_FILE_LENGTH_PROP = "checkstyle.maxfilelen";
    /** property name for allowing tabs **/
    String ALLOW_TABS_PROP = "checkstyle.allow.tabs";
    /** property name for allowing protected data **/
    String TAB_WIDTH_PROP = "checkstyle.tab.width";
    /** property name for allowing protected data **/
    String ALLOW_PROTECTED_PROP = "checkstyle.allow.protected";
    /** property name for allowing package data **/
    String ALLOW_PACKAGE_PROP = "checkstyle.allow.package";
    /** property name for allowing no author **/
    String ALLOW_NO_AUTHOR_PROP = "checkstyle.allow.noauthor";
    /** property name for header file **/
    String HEADER_FILE_PROP = "checkstyle.header.file";
    /** property name for line in header file to ignore **/
    String HEADER_IGNORE_LINE_PROP = "checkstyle.header.ignoreline";
    /** property name for header file line interpretation as regexps */
    String HEADER_LINES_REGEXP_PROP = "checkstyle.header.regexp";
    /** property name for visibility scope where Javadoc is checked **/
    String JAVADOC_CHECKSCOPE_PROP = "checkstyle.javadoc.scope";
    /** property name for checking for Runtime @throws in Javadoc **/
    String JAVADOC_CHECK_UNUSED_THROWS_PROP =
        "checkstyle.javadoc.checkUnusedThrows";
    /** property name for requiring package documentation */
    String REQUIRE_PACKAGE_HTML_PROP = "checkstyle.require.packagehtml";
    /** property name for ignoring import statements **/
    String IGNORE_IMPORTS_PROP = "checkstyle.ignore.imports";
    /** property name for illegal import statements **/
    String ILLEGAL_IMPORTS_PROP = "checkstyle.illegal.imports";
    /** property name for illegal instantiations **/
    String ILLEGAL_INSTANTIATIONS_PROP = "checkstyle.illegal.instantiations";
    /** property name for the line length check exclusion pattern **/
    String IGNORE_LINE_LENGTH_PATTERN_PROP = "checkstyle.ignore.maxlinelen";
    /** property name for ignoring whitespace **/
    String IGNORE_WHITESPACE_PROP = "checkstyle.ignore.whitespace";
    /** property name for ignoring whitespace after casts **/
    String IGNORE_CAST_WHITESPACE_PROP = "checkstyle.ignore.whitespace.cast";
    /** property name for ignoring braces **/
    String IGNORE_BRACES_PROP = "checkstyle.ignore.braces";
    /** property name for ignoring long 'L' **/
    String IGNORE_LONG_ELL_PROP = "checkstyle.ignore.longell";
    /** property name for ignoring wrapping lines on operators **/
    String IGNORE_OP_WRAP_PROP = "checkstyle.ignore.opwrap";
    /** property name for ignoring 'public' in interface definitions **/
    String IGNORE_PUBLIC_IN_INTERFACE_PROP =
        "checkstyle.ignore.public.in.interface";
    /** property name for cache file **/
    String CACHE_FILE_PROP = "checkstyle.cache.file";
    /** property name for ignoring line length of import statements **/
    String IGNORE_IMPORT_LENGTH_PROP = "checkstyle.ignore.importlength";

    /** property name for lcurly placement for methods **/
    String LCURLY_METHOD_PROP = "checkstyle.lcurly.method";
    /** property name for lcurly placement for types **/
    String LCURLY_TYPE_PROP = "checkstyle.lcurly.type";
    /** property name for lcurly placement for others **/
    String LCURLY_OTHER_PROP = "checkstyle.lcurly.other";
    /** property name for rcurly placement **/
    String RCURLY_PROP = "checkstyle.rcurly";
    /** property name for padding around parenthesis **/
    String PAREN_PAD_PROP = "checkstyle.paren.pad";

    /** property name for try block options **/
    String TRY_BLOCK_PROP = "checkstyle.block.try";
    /** property name for catch block options **/
    String CATCH_BLOCK_PROP = "checkstyle.block.catch";
    /** property name for finally block options **/
    String FINALLY_BLOCK_PROP = "checkstyle.block.finally";
    /** property name for the base directory **/
    String BASEDIR_PROP = "checkstyle.basedir";
}
